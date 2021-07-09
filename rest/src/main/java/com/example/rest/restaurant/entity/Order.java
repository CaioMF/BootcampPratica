package com.example.rest.restaurant.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@javax.persistence.Table(name="pedidos")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double totalValue;

    @ManyToOne
    private Table table;
    private boolean status;
    private LocalDate date = LocalDate.now();

    public Order(double totalValue, boolean status, LocalDate date, Table table) {
        this.totalValue = totalValue;
        this.status = status;
        this.date = date;
        this.table = table;
    }

    public Order() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
