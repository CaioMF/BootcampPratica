package com.meli.br.mongo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@Document(collection = "turns")
public class Turns {

    private String status;

    private String date;

    @Field(name = "patient")
    private Patients patient;

    @Field(name = "doctor")
    private Doctor doctor;

}