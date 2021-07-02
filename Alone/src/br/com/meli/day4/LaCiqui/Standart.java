package br.com.meli.day4.LaCiqui;

public class Standart extends Guests{

    public Standart(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Standart "+this.name + ": Viva La pelota");
    }

}
