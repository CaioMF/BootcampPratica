package br.com.meli.day4.Dakar;

import java.util.List;

public class Race {

    private float distance;
    private float prizeInDollar;
    private String name;
    private int maxVehicles;
    private List<Vehicle> vehicles;
    private RescuerCar rescuerCar;
    private RescuerMotocicle rescuerMoto;

    public Race(float distance, float prizeInDollar, String name, int maxVehicles, List<Vehicle> vehicles, RescuerCar rescuerCar, RescuerMotocicle rescuerMoto) {
        this.distance = distance;
        this.prizeInDollar = prizeInDollar;
        this.name = name;
        this.maxVehicles = maxVehicles;
        this.vehicles = vehicles;
        this.rescuerCar = rescuerCar;
        this.rescuerMoto = rescuerMoto;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getPrizeInDollar() {
        return prizeInDollar;
    }

    public void setPrizeInDollar(float prizeInDollar) {
        this.prizeInDollar = prizeInDollar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVehicles() {
        return maxVehicles;
    }

    public void setMaxVehicles(int maxVehicles) {
        this.maxVehicles = maxVehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public RescuerCar getRescuerCar() {
        return rescuerCar;
    }

    public void setRescuerCar(RescuerCar rescuerCar) {
        this.rescuerCar = rescuerCar;
    }

    public RescuerMotocicle getRescuerMoto() {
        return rescuerMoto;
    }

    public void setRescuerMoto(RescuerMotocicle rescuerMoto) {
        this.rescuerMoto = rescuerMoto;
    }

    public boolean isFull(){
        return vehicles.size()==maxVehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {

        if(isFull()||vehicles.size()>this.maxVehicles) {
            this.vehicles = vehicles;
        }else {
            System.out.println("Numero máximo de veiculos atingido");
        }


    }

    public void registerCar(float speed, float acceleration, int angleOfRotation, String plate){

        if(isFull()){
            vehicles.add(new Car(speed, acceleration, angleOfRotation, plate));
        }else {
            System.out.println("Numero máximo de veiculos atingido");
        }

    }

    public void registerMotocicle(float speed, float acceleration, int angleOfRotation, String plate){

        if(isFull()) {
            vehicles.add(new Motocicle(speed, acceleration, angleOfRotation, plate));
        }else {
            System.out.println("Numero máximo de veiculos atingido");
        }

    }

    public void removeVehicle(Vehicle v){
        this.vehicles.remove(v);
    }

    public void rremoveVehiclePerPlate(String plate){
        this.vehicles.removeIf((p) -> p.getPlate().equals(plate));
    }

    public Vehicle winner(){

        float tempWinner=0;
        Vehicle winner = null;

        for (Vehicle v : vehicles) {

            float temp;
            temp = v.getAcceleration() * v.getSpeed() /( v.getAngleOfRotation() * (v.getWeight() - v.getWheels() * 100));
            
            if(temp>tempWinner){
                tempWinner = temp;
                winner = v;
            }

        }
        
        return winner;

    }

    public void rescueCar(String plate){

        Vehicle car =  vehicles.stream().filter((a) -> a.getPlate().equals(plate) && a.getWheels() == 4).findFirst().orElse(null);

        if(car != null){
            rescuerCar.rescue((Car) car);
        }else{
            System.out.println("Carro não encontrado");
        }


    }

    public void rescueMoto(String plate){

        Vehicle moto = vehicles.stream().filter((a) -> a.getPlate().equals(plate) && a.getWheels() == 2).findFirst().orElse(null);

        if(moto != null){
            rescuerMoto.rescue((Motocicle) moto);
        }else{
            System.out.println("Moto não encontrado");
        }
    }

}
