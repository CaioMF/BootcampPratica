package com.meli.br.mongo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "dentists")
public class Doctor {

    private String fistName;

    private String lastName;

    private String Specialitu;

    @Id
    private String email;

}
