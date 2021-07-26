package com.meli.br.mongo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "patients")
public class Patients {

    private String fistName;

    private String lastName;

    private int age;

    private String gender;

    @Id
    private String email;

}
