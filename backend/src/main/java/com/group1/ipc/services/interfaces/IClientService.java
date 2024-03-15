package com.group1.ipc.services.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.group1.ipc.entities.Client;
import com.group1.ipc.repositories.IClientRepository;

public interface IClientService {
	List<Client> getAllClients();
	void addClient(Client client);
	Optional<Client> getClient(int id);
	void updateClient(int id, Client client);
	void deleteClient(int id);
}
