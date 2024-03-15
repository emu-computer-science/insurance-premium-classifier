package com.group1.ipc.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.group1.ipc.entities.Client;
import com.group1.ipc.entities.Payment;

public interface IPaymentService {

	List<Payment> getAllPayments();

	Optional<Payment> getPayment(int id);

	void updatePayment(int id, Payment pay);

	void addPayment(Payment pay);

	void deletePayment(int id);

}
