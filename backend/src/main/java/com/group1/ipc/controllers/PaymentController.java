package com.group1.ipc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.services.interfaces.IPaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	private final IPaymentService paymentService;
	
	public PaymentController(IPaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
}
