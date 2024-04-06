package com.group1.ipc.dtos;

import com.group1.ipc.entities.Client;
import com.group1.ipc.entities.Vehicle;

import java.time.LocalDate;

public class ClamDTO {
    private int id;
    private LocalDate claimDate;

    private Client client;

    private Vehicle vehicle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public Client getClient() {
        return client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


}
