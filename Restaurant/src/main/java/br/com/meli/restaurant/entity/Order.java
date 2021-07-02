package br.com.meli.restaurant.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private long id;
    private double totalValue;
    private List<Dish> dishList = new ArrayList<>();
    private long tableId;

    public Order(long id, double totalValue, List<Dish> dishList, long tableId) {
        this.id = id;
        this.totalValue = totalValue;
        this.dishList = dishList;
        this.tableId = tableId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotalValue() {
        return dishList.stream().mapToDouble(Dish::getTotalValue).sum();
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    public long getTable() {
        return tableId;
    }

    public void setTable(long table) {
        this.tableId = table;
    }

}
