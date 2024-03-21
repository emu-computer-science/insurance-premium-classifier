package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;
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
	
	@GetMapping("/client")
	public List<Client> getAllClients() {
		return clientService.getAllClients();
	}
	
	@GetMapping("/client/{id}")
	public Optional<Client> getClient(@PathVariable int id) {
		return clientService.getClient(id);
	}
	
	@PostMapping("/client")
	public void addClient(@RequestBody Client client) {
		clientService.addClient(client);
	}
	
	@PutMapping("/client/{id}")
	public void updateClient(@RequestBody Client client, @PathVariable int id) {
		clientService.updateClient(id, client);
	}
	
	@DeleteMapping("/client/{id}")
	public void deleteClient(@PathVariable int id) {
		clientService.deleteClient(id);
	}
}
