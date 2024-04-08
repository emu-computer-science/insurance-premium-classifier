package com.group1.ipc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.group1.ipc.dtos.PaymentDTO;
import com.group1.ipc.entities.Organization;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import com.group1.ipc.entities.Client;
import com.group1.ipc.entities.Payment;
import com.group1.ipc.entities.Vehicle;
import com.group1.ipc.repositories.IPaymentRepository;
import com.group1.ipc.services.interfaces.IPaymentService;

@Service
public class PaymentService implements IPaymentService {

	private final IPaymentRepository paymentRepository;
	
	public PaymentService(IPaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}
	public List<Payment> getAllPayments(){
		List<Payment> payments = new ArrayList<>();
		paymentRepository.findAll().forEach(payments :: add);
		return payments;
	}
	
	public Optional<Payment> getPayment(int id) {
		return paymentRepository.findById(id);
	}
	
	public void addPayment(PaymentDTO payDTO, Client client) {
		Payment pay=new Payment();
		pay.setAmount(payDTO.getAmount());
		pay.setClient(client);
		pay.setMissed(payDTO.isMissed());
		pay.setDueDate(payDTO.getDueDate());
		paymentRepository.save(pay);
	}

	public void updatePayment(int id, PaymentDTO payDTO, Client client) {
		Optional<Payment> optionalPayment = paymentRepository.findById(id);
		if (optionalPayment.isPresent()) {
			Payment pay = optionalPayment.get();
			pay.setAmount(payDTO.getAmount());
			pay.setClient(client);
			pay.setMissed(payDTO.isMissed());
			pay.setDueDate(payDTO.getDueDate());
			paymentRepository.save(pay);
		} else {
			throw new EntityNotFoundException("Payment with ID " + id + " not found");
		}
	}
	
	public void deletePayment(int id) {
		paymentRepository.deleteById(id);
	}
	
	public int countAllMissedPayments() {
		int count = 0;
		List<Payment> payments = new ArrayList<>();
		paymentRepository.findAll().forEach(payments :: add);
		for(int i=0;i<payments.size();i++) {
			if(payments.get(i).isMissed()) {
				count++;
			}
		}
		return count;
	}
	
	public List<Client> getAllMissedClients() {
		List<Payment> payments = new ArrayList<>();
		List<Client> clients = new ArrayList<>();
		paymentRepository.findAll().forEach(payments :: add);
		for(int i=0;i<payments.size();i++) {
			if(payments.get(i).isMissed() && ! clients.contains(payments.get(i).getClient())) {
				clients.add(payments.get(i).getClient());
			}
		}
		return clients;
	}
	
	public Stream<Payment> getAllPaymentsByUser(int id){
		List<Payment> payments = new ArrayList<>();
		paymentRepository.findAll().forEach(payments :: add);
		//filter so only vehicles with client id are left
		return payments.stream().filter(p -> p.getClient().getId() == id);
	}
}
