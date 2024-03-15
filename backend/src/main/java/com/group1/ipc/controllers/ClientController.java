package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.entities.Client;
import com.group1.ipc.services.ClientService;
import com.group1.ipc.services.interfaces.IClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

	private final IClientService clientService;
	
	public ClientController(IClientService clientService) {
		this.clientService = clientService;
	}
	
	@RequestMapping("/getclients")
	public List<Client> getAllClients() {
		return clientService.getAllClients();
	}
	
	@RequestMapping("/getclient/{id}")
	public Optional<Client> getClient(@PathVariable int id) {
		return clientService.getClient(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addclient")
	public void addClient(@RequestBody Client client) {
		clientService.addClient(client);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateclient/{id}")
	public void updateClient(@RequestBody Client client, @PathVariable int id) {
		clientService.updateClient(id, client);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteclient/{id}")
	public void deleteClient(@PathVariable int id) {
		clientService.deleteClient(id);
	}
}
