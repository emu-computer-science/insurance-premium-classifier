package com.group1.ipc.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.group1.ipc.dtos.ClaimDTO;
import com.group1.ipc.entities.Claim;

public interface IClaimService {

	List<Claim> getAllClaims();

	Optional<Claim> getClaim(int id);

	void addClaim(ClaimDTO c);

	void updateClaim(int id, ClaimDTO c);

	void deleteClaim(int id);

	int countClaims();

}
