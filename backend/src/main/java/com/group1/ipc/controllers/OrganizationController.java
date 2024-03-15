package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.entities.Organization;
import com.group1.ipc.services.interfaces.IOrganizationService;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {

	private final IOrganizationService organizationService;
	
	public OrganizationController(IOrganizationService organizationService) {
		this.organizationService = organizationService;
	}
	@RequestMapping("/getorg")
	public List<Organization> getAllOrgs() {
		return organizationService.getAllOrgs();
	}
	
	@RequestMapping("/getorg/{id}")
	public Optional<Organization> getOrg(@PathVariable int id) {
		return organizationService.getOrg(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addorg")
	public void addOrg(@RequestBody Organization org) {
		organizationService.addOrg(org);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateorg/{id}")
	public void updateOrg(@RequestBody Organization org, @PathVariable int id) {
		organizationService.updateOrg(id, org);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteorg/{id}")
	public void deletePayment(@PathVariable int id) {
		organizationService.deleteOrg(id);
	}
}
