package com.group1.ipc.dtos;

import com.group1.ipc.entities.*;

import java.util.List;

public class ClientDTO {
    private int id;
    private String address;
    private String firstName;
    private String lastName;

    public Employee employee;

    public List<Vehicle> vehicles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
