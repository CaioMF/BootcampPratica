package br.com.meli.crud.controllers;

import br.com.meli.crud.dao.CarDAO;
import br.com.meli.crud.dto.CarDTO;
import br.com.meli.crud.entity.Car;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class CarController {

    CarDAO carDAO = new CarDAO();

    @GetMapping("/")
    public List<CarDTO> getAll(){
        return new CarDTO().convert(carDAO);
    }

    @GetMapping("/find/{value}")
    public CarDTO find(@PathVariable long value){
        return new CarDTO().convert(carDAO.find(value));
    }

    @PostMapping
    public ResponseEntity<CarDTO> create(@RequestBody CarDTO carDTO, UriComponentsBuilder uriBuilder){
        Car car = carDTO.convert(carDTO,carDAO);
        carDAO.create(car);
        URI uri = uriBuilder.path("find/{value}").buildAndExpand(car.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{value}")
    public CarDTO upadate(@PathVariable long value,@RequestBody CarDTO carDTO){
        Car car = carDTO.convert(carDTO,value);
        return new CarDTO(carDAO.update(car,value));

    }

    @DeleteMapping("/{value}")
    public CarDTO delete(@PathVariable long value){
        return new CarDTO(carDAO.delete(value));
    }


}
