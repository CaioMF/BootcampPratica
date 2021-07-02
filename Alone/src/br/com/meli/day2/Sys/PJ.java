package br.com.meli.day2.Sys;

public class PJ extends People{

    private int hourWorked;
    private double valuePerHour;

    public PJ(int hourWorked, double valuePerHour, String name, Company company) {
        this.hourWorked = hourWorked;
        this.valuePerHour = valuePerHour;
        this.name = name;
        this.company = company;
    }

    public PJ(double valuePerHour, String name) {
        this.valuePerHour = valuePerHour;
        this.name = name;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    @Override
    public double getSalary() {
        return this.hourWorked * this.valuePerHour;
    }

}
