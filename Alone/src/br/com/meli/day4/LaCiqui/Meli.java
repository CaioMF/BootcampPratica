package br.com.meli.day4.LaCiqui;

public class Meli extends Guests{

    public Meli(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Meli " + this.name + ": Viva la Chiqui !!");
    }

}
