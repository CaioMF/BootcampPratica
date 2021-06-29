package br.com.meli.day4.Dakar;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> v = new ArrayList<>();

        v.add(new Car(120,40,90,"Maiami123"));
        v.add(new Motocicle(120,40,90,"RJ123"));
        v.add(new Car(140,20,90,"NY123"));
        v.add(new Car(120,40,90,"Salvador123"));
        v.add(new Car(260,150,90,"SP123"));

        Race r = new Race(5000,100000,"MeliInde",6,v,new RescuerCar(),new RescuerMotocicle());


        r.rremoveVehiclePerPlate("SP123");
        r.rescueCar("RJ123");
        r.rescueMoto("RJ123");

        System.out.println(r.winner().toString());

    }


}
