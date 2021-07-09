package com.example.rest.restaurant.repository;




import com.example.rest.restaurant.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findOrderByStatus(boolean status);

    List<Order> findOrderByDate(LocalDate date);

}
