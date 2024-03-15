package com.group1.ipc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.group1.ipc.entities.Employee;
import com.group1.ipc.repositories.IEmployeeRepository;
import com.group1.ipc.services.interfaces.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	private final IEmployeeRepository employeeRepository;
	
	public EmployeeService(IEmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmps(){
		List<Employee> emps = new ArrayList<>();
		employeeRepository.findAll().forEach(emps :: add);
		return emps;
	}
	
	public Optional<Employee> getEmp(int id) {
		return employeeRepository.findById(id);
	}
	
	public void addEmp(Employee emp) {
		employeeRepository.save(emp);
	}

	public void updateEmp(int id, Employee emp) {
		employeeRepository.save(emp);	
	}
	
	public void deleteEmp(int id) {
		employeeRepository.deleteById(id);
	}
}
