package com.group1.ipc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.group1.ipc.entities.Client;
import com.group1.ipc.entities.Payment;
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
	
	public void addPayment(Payment pay) {
		paymentRepository.save(pay);
	}

	public void updatePayment(int id, Payment pay) {
		paymentRepository.save(pay);	
	}
	
	public void deletePayment(int id) {
		paymentRepository.deleteById(id);
	}
}
