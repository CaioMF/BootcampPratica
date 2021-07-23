package com.meli.br.mongo;


import com.meli.br.mongo.model.Users;
import com.meli.br.mongo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UsersService usersService;

    @Autowired
    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping
    public void insert(@RequestBody Users users){
        usersService.insert(users);
    }
}
