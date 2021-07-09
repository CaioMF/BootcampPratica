package br.com.meli.clients.controller;


import br.com.meli.clients.entity.Order;
import br.com.meli.clients.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{value}")
    public Order findByID(@PathVariable long value){
        return orderService.findById(value);
    }

    @PostMapping
    @PutMapping
    public Order save(@RequestBody Order order){
        return orderService.save(order);
    }

    @GetMapping("/date/{value}")
    public List<Order> findByDate(@PathVariable String value){
        return orderService.findByDate(LocalDate.parse(value));
    }

    @DeleteMapping("/{value}")
    public void delete(@PathVariable long value){
        orderService.delete(value);
    }

}
