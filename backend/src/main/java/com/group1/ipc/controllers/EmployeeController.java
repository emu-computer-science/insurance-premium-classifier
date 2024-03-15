package com.group1.ipc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.entities.Employee;
import com.group1.ipc.services.interfaces.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private final IEmployeeService employeeService;
	
	public EmployeeController(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/getemps")
	public List<Employee> getAllEmps() {
		return employeeService.getAllEmps();
	}
	
	@RequestMapping("/getemp/{id}")
	public Optional<Employee> getEmp(@PathVariable int id) {
		return employeeService.getEmp(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addemp")
	public void addEmp(@RequestBody Employee emp) {
		employeeService.addEmp(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateemp/{id}")
	public void updateEmp(@RequestBody Employee emp, @PathVariable int id) {
		employeeService.updateEmp(id, emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteemp/{id}")
	public void deleteEmp(@PathVariable int id) {
		employeeService.deleteEmp(id);
	}
}
