package com.meli.br.mongo.service;

import com.meli.br.mongo.model.Turns;
import com.meli.br.mongo.repositorys.TurnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnsService {

    private final TurnsRepository turnsRepository;

    @Autowired
    public TurnsService(TurnsRepository turnsRepository) {
        this.turnsRepository = turnsRepository;
    }

    public void insert(Turns turn){
        turnsRepository.insert(turn);
    }

    public List<Turns> findByDoctor(String email){
        return turnsRepository.findByDoctor(email);
    }

    public List<Turns> findByStatus(String status){
        return turnsRepository.findByStatus(status);
    }

    public List<Turns> findAll(){
        return turnsRepository.findAll();
    }


}
