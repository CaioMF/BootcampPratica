package br.com.meli.day4.LaCiqui;

public abstract class Guests {

    protected String name;

    public Guests(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
}
