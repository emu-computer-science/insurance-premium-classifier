package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.entities.Client;
import com.group1.ipc.entities.Payment;
import com.group1.ipc.services.interfaces.IPaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	private final IPaymentService paymentService;
	
	public PaymentController(IPaymentService paymentService) {
		this.paymentService = paymentService;
	}
	@RequestMapping("/getpayments")
	public List<Payment> getAllPayments() {
		return paymentService.getAllPayments();
	}
	
	@RequestMapping("/getpayment/{id}")
	public Optional<Payment> getPayment(@PathVariable int id) {
		return paymentService.getPayment(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addpayment")
	public void addPayment(@RequestBody Payment pay) {
		paymentService.addPayment(pay);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updatepayment/{id}")
	public void updatePayment(@RequestBody Payment pay, @PathVariable int id) {
		paymentService.updatePayment(id, pay);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deletepayment/{id}")
	public void deletePayment(@PathVariable int id) {
		paymentService.deletePayment(id);
	}
}
