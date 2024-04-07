package com.group1.ipc.dtos;

import com.group1.ipc.entities.Client;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentDTO {
    private int id;
    private BigDecimal amount;
    private LocalDate dueDate;
    private Client client;
    private boolean missed;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isMissed() {
        return missed;
    }

    public void setMissed(boolean missed) {
        this.missed = missed;
    }

}
