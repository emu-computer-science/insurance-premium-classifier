package com.group1.ipc.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.group1.ipc.entities.Payment;

public interface IPaymentRepository extends ListCrudRepository<Payment, Integer> {

}
