package com.group1.ipc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.services.interfaces.IClaimService;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

	private final IClaimService claimService;
	
	public ClaimController(IClaimService claimService) {
		this.claimService = claimService;
	}
	
}
