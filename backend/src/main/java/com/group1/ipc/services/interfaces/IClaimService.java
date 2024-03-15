package com.group1.ipc.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.group1.ipc.entities.Claim;

public interface IClaimService {

	List<Claim> getAllClaims();

	Optional<Claim> getClaim(int id);

	void addClaim(Claim c);

	void updateClaim(int id, Claim c);

	void deleteClaim(int id);

	int countClaims();

}
