package br.com.meli.clients.entity;

import java.util.List;

public class Order {

    private long id;
    private List<Product> products;
    private double totalValue;

    public Order(long id, List<Product> products, double totalValue) {
        this.id = id;
        this.products = products;
        this.totalValue = totalValue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalValue() {
        return products.stream().mapToDouble(p -> p.getValue() * p.getCount()).sum();
    }


}
