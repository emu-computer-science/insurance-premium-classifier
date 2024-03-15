package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.entities.Vehicle;
import com.group1.ipc.services.interfaces.IVehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

	private final IVehicleService vehicleService;
	
	public VehicleController(IVehicleService vehicleController) {
		this.vehicleService = vehicleController;
	}
	
	@RequestMapping("/getvehicles")
	public List<Vehicle> getAllVehicles() {
		return vehicleService.getAllVehicles();
	}
	
	//get vehicle based on vehicle id
	@RequestMapping("/getvehicle/{id}")
	public Optional<Vehicle> getVehicle(@PathVariable int id) {
		return vehicleService.getVehicle(id);
	}
	
	//get vehicles owned by specific client
	@RequestMapping("/getvehicles/{id}")
	public Stream<Vehicle> getVehicles(@PathVariable int id) {
		return vehicleService.getVehicles(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addvehicle")
	public void addVehicle(@RequestBody Vehicle v) {
		vehicleService.addVehicle(v);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updatevehicle/{id}")
	public void updatePayment(@RequestBody Vehicle v, @PathVariable int id) {
		vehicleService.updateVehicle(id, v);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deletevehicle/{id}")
	public void deletePayment(@PathVariable int id) {
		vehicleService.deleteVehicle(id);
	}
}
