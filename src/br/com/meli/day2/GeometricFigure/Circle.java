package br.com.meli.day2.GeometricFigure;

public class Circle extends GeometricFigure{

    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double area() {
        return 3.14 * Math.sqrt(this.diameter/2);
    }

}
