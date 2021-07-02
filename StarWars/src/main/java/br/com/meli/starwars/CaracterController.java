package br.com.meli.starwars;

import br.com.meli.starwars.entity.Caracter;
import br.com.meli.starwars.repository.CaracterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CaracterController {

    private final CaracterRepository caracterRepository;


    @Autowired
    public CaracterController(CaracterRepository caracterRepository) {
        this.caracterRepository = caracterRepository;
    }

    @GetMapping("/")
    public List<Caracter> getAll(){
        return caracterRepository.getAll();
    }

    @GetMapping("/find/{value}")
    public Caracter find(@PathVariable String value){
        return caracterRepository.find(value);
    }

}
