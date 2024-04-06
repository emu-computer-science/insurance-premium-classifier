package com.group1.ipc.dtos;

import com.group1.ipc.entities.Employee;
import com.group1.ipc.entities.Organization;

public class EmployeeDTO {
    private int id;
    private String firstName;
    private String lastName;
    private Employee manager;

    private Organization organization;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
