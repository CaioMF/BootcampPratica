package com.meli.br.mongo.controllers;


import com.meli.br.mongo.model.Turns;
import com.meli.br.mongo.service.TurnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turns")
public class TurnsController {

    private final TurnsService turnService;

    @Autowired
    public TurnsController(TurnsService turnService) {
        this.turnService = turnService;
    }

    @PostMapping
    public void insert(@RequestBody Turns turn){
        turnService.insert(turn);
    }

    @GetMapping("doctor/{value}")
    public List<Turns> findByDoctor(@PathVariable String email){
        return turnService.findByDoctor(email);
    }

    @GetMapping("status/{value}")
    public List<Turns> findByStatus(@PathVariable String status){
        return turnService.findByDoctor(status);
    }

    @GetMapping
    public List<Turns> findAll(){
        return turnService.findAll();
    }
}
