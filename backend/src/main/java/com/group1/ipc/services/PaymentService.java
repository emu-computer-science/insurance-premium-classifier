package com.group1.ipc.services;

import org.springframework.stereotype.Service;

import com.group1.ipc.repositories.IPaymentRepository;
import com.group1.ipc.services.interfaces.IPaymentService;

@Service
public class PaymentService implements IPaymentService {

	private final IPaymentRepository paymentRepository;
	
	public PaymentService(IPaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}
}
