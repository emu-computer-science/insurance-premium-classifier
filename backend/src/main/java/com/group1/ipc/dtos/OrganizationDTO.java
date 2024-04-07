package com.group1.ipc.dtos;

<<<<<<< HEAD
import com.group1.ipc.entities.Employee;

import java.util.List;

=======
import java.util.List;

import com.group1.ipc.entities.Employee;

>>>>>>> main
public class OrganizationDTO {
    private int id;
    private String name;
    private String address;
    public List<Employee> employees;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
<<<<<<< HEAD

=======
>>>>>>> main

}
