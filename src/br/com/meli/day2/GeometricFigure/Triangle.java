package br.com.meli.day2.GeometricFigure;

public class Triangle extends GeometricFigure{

    private double base;
    private double high;

    public Triangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    @Override
    public double area() {
        return 0.5 * this.base * this.high;
    }
}
