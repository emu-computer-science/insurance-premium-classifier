package com.group1.ipc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.services.interfaces.IVehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

	private final IVehicleService vehicleController;
	
	public VehicleController(IVehicleService vehicleController) {
		this.vehicleController = vehicleController;
	}
	
}
