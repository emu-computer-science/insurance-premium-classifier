package com.group1.ipc.dtos;

import com.group1.ipc.entities.Employee;
import com.group1.ipc.entities.Payment;
import com.group1.ipc.entities.Vehicle;

import java.util.List;

public class ClientDTO {
    private int id;
    private String address;
    private String firstName;
    private String lastName;

    public Employee employee;

    public List<Vehicle> vehicles;

    public List<Payment> payments;

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee getEmployee() {
        return employee;
    }


}
