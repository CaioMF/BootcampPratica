package com.meli.br.mongo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "user")
public class Users {

    private String name;

    private int age;

}
