package br.com.meli.day4.Dakar;

import java.util.Objects;

public class Vehicle{

    protected float speed;
    protected float acceleration;
    protected int angleOfRotation;
    protected String plate;
    protected float weight;
    protected int wheels;

    public Vehicle(float speed, float acceleration, int angleOfRotation, String plate, float weight, int wheels) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.angleOfRotation = angleOfRotation;
        this.plate = plate;
        this.weight = weight;
        this.wheels = wheels;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public int getAngleOfRotation() {
        return angleOfRotation;
    }

    public void setAngleOfRotation(int angleOfRotation) {
        this.angleOfRotation = angleOfRotation;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return this.plate.equals(vehicle.getPlate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", angleOfRotation=" + angleOfRotation +
                ", plate='" + plate + '\'' +
                ", weight=" + weight +
                ", wheels=" + wheels +
                '}';
    }
}
