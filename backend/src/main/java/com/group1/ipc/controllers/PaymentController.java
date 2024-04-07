package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;

import com.group1.ipc.dtos.PaymentDTO;
import org.springframework.web.bind.annotation.*;
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
	@GetMapping("/payment")
	public List<Payment> getAllPayments() {
		return paymentService.getAllPayments();
	}
	
	@GetMapping("/payment/{id}")
	public Optional<Payment> getPayment(@PathVariable int id) {
		return paymentService.getPayment(id);
	}
	
	@PostMapping("/payment")
	public void addPayment(@RequestBody PaymentDTO payDTO) {
		paymentService.addPayment(payDTO);
	}
	
	@PutMapping("/payment/{id}")
	public void updatePayment(@RequestBody PaymentDTO payDTO, @PathVariable int id) {
		paymentService.updatePayment(id, payDTO);
	}
	
	@DeleteMapping("/payment/{id}")
	public void deletePayment(@PathVariable int id) {
		paymentService.deletePayment(id);
	}
}
