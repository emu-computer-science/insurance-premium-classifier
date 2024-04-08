package com.group1.ipc.services.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.group1.ipc.dtos.PaymentDTO;
import com.group1.ipc.entities.Client;
import com.group1.ipc.entities.Payment;

public interface IPaymentService {

	List<Payment> getAllPayments();

	Optional<Payment> getPayment(int id);

	void updatePayment(int id, PaymentDTO payDTO);

	void addPayment(PaymentDTO payDTO);

	void deletePayment(int id);

	int countAllMissedPayments();

	List<Client> getAllMissedClients();
	
	Stream<Payment> getAllPaymentsByUser(int id);
}
