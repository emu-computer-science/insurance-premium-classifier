package com.group1.ipc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.services.interfaces.IClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

	private final IClientService clientService;
	
	public ClientController(IClientService clientService) {
		this.clientService = clientService;
	}
}
