package com.group1.ipc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.group1.ipc.entities.Vehicle;
import com.group1.ipc.repositories.IVehicleRepository;
import com.group1.ipc.services.interfaces.IVehicleService;

@Service
public class VehicleService implements IVehicleService {

	private final IVehicleRepository vehicleRepository;
	
	public VehicleService(IVehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
	public List<Vehicle> getAllVehicles(){
		List<Vehicle> vehicles = new ArrayList<>();
		vehicleRepository.findAll().forEach(vehicles :: add);
		return vehicles;
	}
	
	//finds vehicles owned by 1 client
	public Stream<Vehicle> getVehicles(int id) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicleRepository.findAll().forEach(vehicles :: add);
		//filter so only vehicles with client id are left
		return vehicles.stream().filter(v -> v.getClient().getId() == id);
	}
	
	public Optional<Vehicle> getVehicle(int id) {
		return vehicleRepository.findById(id);
	}
	
	public void addVehicle(Vehicle v) {
		vehicleRepository.save(v);
	}

	public void updateVehicle(int id, Vehicle v) {
		vehicleRepository.save(v);	
	}
	
	public void deleteVehicle(int id) {
		vehicleRepository.deleteById(id);
	}
}
