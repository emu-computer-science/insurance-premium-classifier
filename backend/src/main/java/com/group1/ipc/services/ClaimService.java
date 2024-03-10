package com.group1.ipc.services;

import org.springframework.stereotype.Service;

import com.group1.ipc.repositories.IClaimRepository;
import com.group1.ipc.services.interfaces.IClaimService;

@Service
public class ClaimService implements IClaimService {

	private final IClaimRepository claimRepository;
	
	public ClaimService(IClaimRepository claimRepository) {
		this.claimRepository = claimRepository;
	}
	
}
