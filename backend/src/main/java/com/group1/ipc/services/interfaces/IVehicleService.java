package com.group1.ipc.services.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.group1.ipc.entities.Vehicle;

public interface IVehicleService {

	List<Vehicle> getAllVehicles();

	Stream<Vehicle> getVehicles(int id);

	void addVehicle(Vehicle v);

	void updateVehicle(int id, Vehicle v);

	void deleteVehicle(int id);

	Optional<Vehicle> getVehicle(int id);

}
