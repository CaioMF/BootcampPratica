package com.example.rest.restaurant.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@javax.persistence.Table(name="mesa")
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  double valueTotal;

    @OneToMany(targetEntity = Order.class, mappedBy = "table", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orderList;

    @ManyToOne
    private Restaurant restaurant;

    public Table(double valueTotal, List<Order> orderList1, Restaurant restaurant) {
        this.valueTotal = valueTotal;
        this.orderList = orderList1;
        this.restaurant = restaurant;
    }

    public Table() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValueTotal() {
        return valueTotal;
    }

    public void setValueTotal(double valueTotal) {
        this.valueTotal = valueTotal;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

}
