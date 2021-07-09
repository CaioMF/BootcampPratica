package com.example.rest.restaurant.service;



import com.example.rest.restaurant.entity.Order;
import com.example.rest.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class OrderService {
    
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order save(Order order){
        return orderRepository.save(order);
    }

    public Order findById(long orderId){
        return orderRepository.findById(orderId).orElseThrow(NoSuchElementException::new);
    }

    public void delete(long id){
        orderRepository.delete(findById(id));
    }

    public List<Order> findByStatus(boolean status){
        return orderRepository.findOrderByStatus(status);
    }


    public List<Order> findByDate(LocalDate date){
        return orderRepository.findOrderByDate(date);
    }
}
