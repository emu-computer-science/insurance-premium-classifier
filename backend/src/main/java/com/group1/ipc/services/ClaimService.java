package com.group1.ipc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.group1.ipc.entities.Claim;
import com.group1.ipc.repositories.IClaimRepository;
import com.group1.ipc.services.interfaces.IClaimService;

@Service
public class ClaimService implements IClaimService {

	private final IClaimRepository claimRepository;
	
	public ClaimService(IClaimRepository claimRepository) {
		this.claimRepository = claimRepository;
	}
	
	public List<Claim> getAllClaims(){
		List<Claim> claims = new ArrayList<>();
		claimRepository.findAll().forEach(claims :: add);
		return claims;
	}
	
	public Optional<Claim> getClaim(int id) {
		return claimRepository.findById(id);
	}
	
	public void addClaim(Claim claim) {
		claimRepository.save(claim);
	}

	public void updateClaim(int id, Claim claim) {
		claimRepository.save(claim);	
	}
	
	public void deleteClaim(int id) {
		claimRepository.deleteById(id);
	}
	
	public int countClaims() {
		List<Claim> claims = new ArrayList<>();
		claimRepository.findAll().forEach(claims :: add);
		return claims.size();
	}
}
