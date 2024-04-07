package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;

import com.group1.ipc.dtos.ClaimDTO;
import org.springframework.web.bind.annotation.*;
import com.group1.ipc.entities.Claim;
import com.group1.ipc.services.interfaces.IClaimService;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

	private final IClaimService claimService;
	
	public ClaimController(IClaimService claimService) {
		this.claimService = claimService;
	}
	
	@GetMapping("/claim")
	public List<Claim> getAllClaims() {
		return claimService.getAllClaims();
	}
	
	@GetMapping("/claim/{id}")
	public Optional<Claim> getClaim(@PathVariable int id) {
		return claimService.getClaim(id);
	}
	
	@PostMapping("/claim")
	public void addClaim(@RequestBody ClaimDTO c) {
		claimService.addClaim(c);
	}
	
	@PutMapping("/claim/{id}")
	public void updateClaim(@RequestBody ClaimDTO c, @PathVariable int id) {
		claimService.updateClaim(id, c);
	}
	
	@DeleteMapping("/claim/{id}")
	public void deleteClaim(@PathVariable int id) {
		claimService.deleteClaim(id);
	}
	
	@GetMapping("/count")
	public int countClaims() {
		return claimService.countClaims();
	}
}
