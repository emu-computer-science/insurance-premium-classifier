package com.group1.ipc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.group1.ipc.dtos.VehicleDTO;
import com.group1.ipc.entities.Client;
import com.group1.ipc.entities.Payment;
import jakarta.persistence.EntityNotFoundException;
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
	
	public void addVehicle(VehicleDTO vDTO, Client client) {
		Vehicle v=new Vehicle();
		v.setMake(vDTO.getMake());
		v.setMiles(vDTO.getMiles());
		v.setModel(vDTO.getModel());
		v.setPlate(vDTO.getPlate());
		v.setVin(vDTO.getVin());
		v.setYear(vDTO.getYear());
		v.setClient(client);
		vehicleRepository.save(v);
	}

	public void updateVehicle(int id, VehicleDTO vDTO, Client client) {
		Optional<Vehicle> optionalVehicle = vehicleRepository.findById(id);
		if (optionalVehicle.isPresent()) {
			Vehicle v = optionalVehicle.get();
			v.setMake(vDTO.getMake());
			v.setMiles(vDTO.getMiles());
			v.setModel(vDTO.getModel());
			v.setPlate(vDTO.getPlate());
			v.setVin(vDTO.getVin());
			v.setYear(vDTO.getYear());
			v.setClient(client);
			vehicleRepository.save(v);
		} else {
			throw new EntityNotFoundException("Payment with ID " + id + " not found");
		}
	}
	
	public void deleteVehicle(int id) {
		vehicleRepository.deleteById(id);
	}
}
