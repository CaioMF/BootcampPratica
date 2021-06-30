package br.com.meli.day1.Exercicio7;

public class Company {

    private String name = null;
    private String date = null;
    private int value = 0;
    private float taxUp = 0.0f;
    
    public Company(String name, String date, int value, float taxUp) {
        this.name = name;
        this.date = date;
        this.value = value;
        this.taxUp = taxUp;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }
    
    public void upDate() {

        String[] replace = this.date.split("/");

        this.date = "01/01/"+ String.valueOf(Integer.parseInt(replace[2])+1);

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public float getTaxUp() {
        return taxUp;
    }

    public void setTaxUp(float taxUp) {
        this.taxUp = taxUp;
    }

    
}
