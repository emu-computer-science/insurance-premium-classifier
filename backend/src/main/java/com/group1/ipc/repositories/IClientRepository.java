package com.group1.ipc.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.group1.ipc.entities.Client;

public interface IClientRepository extends ListCrudRepository<Client, Integer> {

}
