package br.com.meli.diplomat.entity;

public class Subject {

    private final String name;
    private final double grade;

    public Subject(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return this.grade;
    }

}
