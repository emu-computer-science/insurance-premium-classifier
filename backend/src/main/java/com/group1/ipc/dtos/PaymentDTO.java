package com.group1.ipc.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentDTO {
    private int id;
    private BigDecimal amount;
    private LocalDate dueDate;
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
