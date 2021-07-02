package br.com.meli.restaurant.entity;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private long id;
    private List<Order> orderList = new ArrayList<>();
    private  double valueTotal;

    public Table(long id, List<Order> orderList, double valueTotal) {
        this.id = id;
        this.orderList = orderList;
        this.valueTotal = valueTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public double getValueTotal() {
        return orderList.stream().mapToDouble(Order::getTotalValue).sum();
    }



}
