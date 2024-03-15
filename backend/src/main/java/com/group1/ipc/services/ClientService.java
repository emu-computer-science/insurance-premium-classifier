package com.group1.ipc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.group1.ipc.entities.Client;
import com.group1.ipc.repositories.IClientRepository;
import com.group1.ipc.services.interfaces.IClientService;

@Service
public class ClientService implements IClientService {

	private final IClientRepository clientRepository;
	
	public ClientService(IClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public List<Client> getAllClients(){
		List<Client> clients = new ArrayList<>();
		clientRepository.findAll().forEach(clients :: add);
		return clients;
	}
	
	public Optional<Client> getClient(int id) {
		return clientRepository.findById(id);
	}
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}

	public void updateClient(int id, Client client) {
		clientRepository.save(client);	
	}
	
	public void deleteClient(int id) {
		clientRepository.deleteById(id);
	}
	
}
