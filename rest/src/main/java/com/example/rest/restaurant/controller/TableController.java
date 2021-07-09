package com.example.rest.restaurant.controller;


import com.example.rest.restaurant.entity.Order;
import com.example.rest.restaurant.entity.Table;
import com.example.rest.restaurant.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("table")
public class TableController {

    private final TableService ts;

    @Autowired
    public TableController(TableService ts) {
        this.ts = ts;
    }


    @PostMapping
    public String add(@RequestBody Table table) {

        ts.add(table);
        return "Inserido com sucesso!";

    }

    @GetMapping("/order/{value}")
    public List<Order> getOrder(@PathVariable long value){
        return ts.getOrders(value);
    }


}
