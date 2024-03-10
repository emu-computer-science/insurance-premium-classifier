package com.group1.ipc.services;

import org.springframework.stereotype.Service;

import com.group1.ipc.repositories.IOrganizationRepository;
import com.group1.ipc.services.interfaces.IOrganizationService;

@Service
public class OrganizationService implements IOrganizationService {

	private IOrganizationRepository organizationRepository;
	
	public OrganizationService(IOrganizationRepository organizationRepository) {
		this.organizationRepository = organizationRepository;
	}
}
