package br.com.meli.restaurant.entity;

public class Dish {

    private long id;
    private String description;
    private double value;
    private int quant;

    public Dish(long id, String description, double value, int quant) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.quant = quant;
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
