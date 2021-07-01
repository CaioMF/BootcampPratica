package br.com.meli.crud.dto;

import br.com.meli.crud.dao.CarDAO;
import br.com.meli.crud.entity.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarDTO {

    private int year;
    private String model;

    public CarDTO(Car car) {
        this.year = car.getYear();
        this.model = car.getModel();
    }

    public CarDTO() {

    }

    public CarDTO convert(Car car) {
       return new CarDTO(car);
    }

    public Car convert(CarDTO carDTO, CarDAO dao) { return new Car(dao.getCars().size() + 1,carDTO.getModel(),carDTO.getYear());}

    public Car convert(CarDTO carDTO, long id) { return new Car(id,carDTO.getModel(),carDTO.getYear());}

    public List<CarDTO> convert(CarDAO carDAO) {
        return carDAO.getCars().stream().map(CarDTO::new).collect(Collectors.toList());
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

}
