package com.meli.br.mongo.repositorys;

import com.meli.br.mongo.model.Patients;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends MongoRepository<Patients, String> {
}
