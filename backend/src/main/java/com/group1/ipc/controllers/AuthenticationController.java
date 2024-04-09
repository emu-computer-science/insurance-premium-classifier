package com.group1.ipc.controllers;

import com.group1.ipc.dtos.ClientDTO;
import com.group1.ipc.entities.Client;
import com.group1.ipc.services.ClientService;
import com.group1.ipc.services.interfaces.IClientService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.dtos.MessageDTO;

@RestController
@RequestMapping("/api")
public class AuthenticationController {


	private final IClientService clientService;

    public AuthenticationController(IClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/logged-in")
	public MessageDTO loggedIn(Authentication authentication) {
		boolean loggedIn = authentication != null;
		return new MessageDTO(String.valueOf(loggedIn));
	}
	@GetMapping("/logged-in/info")
	public ClientDTO loggedInInfo(Authentication authentication) {
		Client client = (Client)authentication.getPrincipal();
		ClientDTO clientDTO = clientService.returnClientInfo(client);
		return clientDTO;
	}

	
}
