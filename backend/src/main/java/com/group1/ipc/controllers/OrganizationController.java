package com.group1.ipc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.services.interfaces.IOrganizationService;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {

	private final IOrganizationService organizationService;
	
	public OrganizationController(IOrganizationService organizationService) {
		this.organizationService = organizationService;
	}
	
}
