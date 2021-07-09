package com.example.rest.restaurant.repository;

import com.example.rest.restaurant.entity.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TableRepository extends JpaRepository<Table,Long> {

}
