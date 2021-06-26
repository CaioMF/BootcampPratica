package br.com.meli.day2.GeometricFigure;

public class Rectangle extends GeometricFigure{

    private double width;
    private double large;

    public Rectangle(double width, double large) {
        this.width = width;
        this.large = large;
    }

    @Override
    public double area() {
        return this.width * this.large;
    }
}
