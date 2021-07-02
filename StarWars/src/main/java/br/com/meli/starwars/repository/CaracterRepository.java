package br.com.meli.starwars.repository;

import br.com.meli.starwars.entity.Caracter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CaracterRepository {

    private static final File FILE = new File("src/main/resources/starwars.json");
    
    private final ObjectMapper mapper;

    @Autowired
    public CaracterRepository(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public List<Caracter> getAll(){

        List<Caracter> caracters = new ArrayList<>();

        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Caracter>> typeReference = new TypeReference<List<Caracter>>() {};
            caracters = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return caracters;

    }

    public Caracter find(String name){
        return getAll().stream().filter(f -> f.getName().contains(name)).findFirst().orElseThrow(RuntimeException::new);
    }

}
