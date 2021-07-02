package br.com.meli.clients.entity;

public class Product {

    private long id;
    private int count;
    private double value;
    private String description;
    private String color;

    public Product(long id, int count, double value, String description, String color) {
        this.id = id;
        this.count = count;
        this.value = value;
        this.description = description;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
