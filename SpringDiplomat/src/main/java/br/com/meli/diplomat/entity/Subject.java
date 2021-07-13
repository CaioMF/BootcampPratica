package br.com.meli.diplomat.entity;

public class Subject {

    private long id;
    private String name;
    private double note;

    public Subject(String name, double note) {
         this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public double getNote() {
        return note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
