package com.example.rest.restaurant.service;


import com.example.rest.restaurant.entity.Order;
import com.example.rest.restaurant.entity.Table;
import com.example.rest.restaurant.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TableService {

    private final TableRepository tr;

    @Autowired
    public TableService(TableRepository tr) {
        this.tr = tr;
    }

    public List<Order> getOrders(long id){
         return tr.findById(id).orElseThrow(NoSuchElementException::new).getOrderList();
     }

    public void add(Table table){
        tr.save(table);
    }

}
