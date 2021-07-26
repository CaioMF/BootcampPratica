package com.meli.br.mongo.repositorys;

import com.meli.br.mongo.model.Turns;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnsRepository extends MongoRepository<Turns, String> {

    List<Turns> findByDoctor(String id);

    List<Turns> findByStatus(String status);
}
