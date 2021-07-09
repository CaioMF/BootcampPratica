package com.example.rest.restaurant.entity;

import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "Prato")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private double value;
    private int quant;


    @ManyToOne
    private Order order;

    public Dish(String description, double value, int quant, Order order) {
        this.description = description;
        this.value = value;
        this.quant = quant;
        this.order = order;
    }

    public Dish() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getTotalValue(){
        return this.quant * this.value;
    }

}
