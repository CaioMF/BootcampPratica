package br.com.meli.day1.Exercicio8;

public class Product {
    
    private String name;
    private float value;
    private int count;

    public Product(String name, float value, int count) {
        this.name = name;
        this.value = value;
        this.count = count;
    }
    public Product() {
      
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
   
}
