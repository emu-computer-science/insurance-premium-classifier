package com.group1.ipc.services;

import org.springframework.stereotype.Service;

import com.group1.ipc.repositories.IVehicleRepository;
import com.group1.ipc.services.interfaces.IVehicleService;

@Service
public class VehicleService implements IVehicleService {

	private final IVehicleRepository vehicleRepository;
	
	public VehicleService(IVehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
	
}
