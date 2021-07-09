package com.example.rest.restaurant.entity;

import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="restaurante")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double cash;

    public Restaurant() {
    }

    public Restaurant(double cash){
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
