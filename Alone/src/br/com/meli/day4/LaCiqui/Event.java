package br.com.meli.day4.LaCiqui;

import java.util.List;

public class Event {

    private List<Guests> guests;
    private List<Firework> fireworks;

    public Event(List<Guests> guests, List<Firework> fireworks) {
        this.guests = guests;
        this.fireworks = fireworks;
    }

    public List<Guests> getGuests() {
        return guests;
    }

    public void addGuests(Guests guests) {
        this.guests.add(guests);
    }

    public void setGuests(List<Guests> guests) {
        this.guests = guests;
    }

    public List<Firework> getFireworks() {
        return fireworks;
    }

    public void addFireworks(Firework fireworks) {
        this.fireworks.add(fireworks);
    }

    public void setFireworks(List<Firework> fireworks) {
        this.fireworks = fireworks;
    }

    public void candleOff(){

        fireworks.forEach(Firework::explosion);
        System.out.println();
        guests.forEach(Guests::eat);

    }

}
