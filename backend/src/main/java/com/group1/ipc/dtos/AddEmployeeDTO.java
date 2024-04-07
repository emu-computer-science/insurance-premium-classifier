package com.group1.ipc.dtos;

import com.group1.ipc.entities.Employee;
import com.group1.ipc.entities.Organization;

public class AddEmployeeDTO {
    private int id;
    private String firstName;
    private String lastName;
    private Employee manager;

    private Organization organization;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Employee getManager() {
        return manager;
    }

    public Organization getOrganization() {
        return organization;
    }

}
