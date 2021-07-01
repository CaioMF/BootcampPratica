package br.com.meli.crud.dao;

import br.com.meli.crud.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    private List<Car> cars;

    public CarDAO() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void create(Car car){
        cars.add(car);
    }

    public Car find(long id){
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElseThrow(RuntimeException::new);
    }

    public Car delete(long id){
        Car removed = find(id);
        cars.remove(removed);
        return removed;
    }

    public Car update(Car car, long id){
        return cars.set( cars.indexOf( find(id) ) , car );
    }

}
