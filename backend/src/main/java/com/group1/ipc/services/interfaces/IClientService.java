package com.group1.ipc.services.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.group1.ipc.dtos.ClientDTO;
import com.group1.ipc.entities.Client;
import com.group1.ipc.repositories.IClientRepository;

public interface IClientService {
	List<Client> getAllClients();
	void addClient(ClientDTO clientDTO);
	Optional<Client> getClient(int id);
	void updateClient(int id, ClientDTO clientDTO);
	void deleteClient(int id);

	ClientDTO returnClientInfo(Client client);
}
