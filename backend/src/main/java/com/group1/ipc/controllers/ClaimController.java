package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.entities.Claim;
import com.group1.ipc.services.interfaces.IClaimService;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

	private final IClaimService claimService;
	
	public ClaimController(IClaimService claimService) {
		this.claimService = claimService;
	}
	@RequestMapping("/getclaims")
	public List<Claim> getAllClaims() {
		return claimService.getAllClaims();
	}
	
	@RequestMapping("/getclaim/{id}")
	public Optional<Claim> getClaim(@PathVariable int id) {
		return claimService.getClaim(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addclaim")
	public void addClaim(@RequestBody Claim c) {
		claimService.addClaim(c);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateclaim/{id}")
	public void updateClaim(@RequestBody Claim c, @PathVariable int id) {
		claimService.updateClaim(id, c);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteclaim/{id}")
	public void deleteClaim(@PathVariable int id) {
		claimService.deleteClaim(id);
	}
	
	@RequestMapping("/countclaims")
	public int countClaims() {
		return claimService.countClaims();
	}
}
