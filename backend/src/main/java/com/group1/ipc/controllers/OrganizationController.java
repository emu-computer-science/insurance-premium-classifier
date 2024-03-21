package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.web.bind.annotation.*;
import com.group1.ipc.entities.Organization;
import com.group1.ipc.services.interfaces.IOrganizationService;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {

	private final IOrganizationService organizationService;
	
	public OrganizationController(IOrganizationService organizationService) {
		this.organizationService = organizationService;
	}
	@GetMapping("/org")
	public List<Organization> getAllOrgs() {
		return organizationService.getAllOrgs();
	}
	
	@GetMapping("/org/{id}")
	public Optional<Organization> getOrg(@PathVariable int id) {
		return organizationService.getOrg(id);
	}
	
	@PostMapping("/org")
	public void addOrg(@RequestBody Organization org) {
		organizationService.addOrg(org);
	}
	
	@PutMapping("/org/{id}")
	public void updateOrg(@RequestBody Organization org, @PathVariable int id) {
		organizationService.updateOrg(id, org);
	}
	
	@DeleteMapping("/org/{id}")
	public void deleteorg(@PathVariable int id) {
		organizationService.deleteOrg(id);
	}
}
