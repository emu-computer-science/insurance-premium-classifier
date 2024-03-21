package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.web.bind.annotation.*;
import com.group1.ipc.entities.Vehicle;
import com.group1.ipc.services.interfaces.IVehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

	private final IVehicleService vehicleService;
	
	public VehicleController(IVehicleService vehicleController) {
		this.vehicleService = vehicleController;
	}
	
	@GetMapping("/vehicle")
	public List<Vehicle> getAllVehicles() {
		return vehicleService.getAllVehicles();
	}
	
	//get vehicle based on vehicle id
	@GetMapping("/vehicle/{id}")
	public Optional<Vehicle> getVehicle(@PathVariable int id) {
		return vehicleService.getVehicle(id);
	}
	
	//get vehicles owned by specific client
	@GetMapping("/vehicles/{id}")
	public Stream<Vehicle> getVehicles(@PathVariable int id) {
		return vehicleService.getVehicles(id);
	}
	
	@PostMapping("/vehicle")
	public void addVehicle(@RequestBody Vehicle v) {
		vehicleService.addVehicle(v);
	}
	
	@PutMapping("/vehicle/{id}")
	public void updatePayment(@RequestBody Vehicle v, @PathVariable int id) {
		vehicleService.updateVehicle(id, v);
	}
	
	@DeleteMapping("/vehicle/{id}")
	public void deletePayment(@PathVariable int id) {
		vehicleService.deleteVehicle(id);
	}
}
