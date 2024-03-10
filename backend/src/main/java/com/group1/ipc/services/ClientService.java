package com.group1.ipc.services;

import org.springframework.stereotype.Service;

import com.group1.ipc.repositories.IClientRepository;
import com.group1.ipc.services.interfaces.IClientService;

@Service
public class ClientService implements IClientService {

	private final IClientRepository clientRepository;
	
	public ClientService(IClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
}
