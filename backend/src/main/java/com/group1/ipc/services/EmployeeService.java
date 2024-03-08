package com.group1.ipc.services;

import org.springframework.stereotype.Service;

import com.group1.ipc.repositories.IEmployeeRepository;
import com.group1.ipc.services.interfaces.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	private final IEmployeeRepository employeeRepository;
	
	public EmployeeService(IEmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
}
