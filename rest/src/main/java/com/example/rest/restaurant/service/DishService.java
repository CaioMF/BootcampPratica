package com.example.rest.restaurant.service;

import com.example.rest.restaurant.entity.Dish;
import com.example.rest.restaurant.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class DishService {

    private final DishRepository dishRepository;

    @Autowired
    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public Dish save(Dish dish){
        return dishRepository.save(dish);
    }

    public Dish findById(long dishId){
        return dishRepository.findById(dishId).orElseThrow(NoSuchElementException::new);
    }

    public void delete(Dish dish){
        dishRepository.delete(dish);
    }

}
