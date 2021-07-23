package com.meli.br.mongo.service;

import com.meli.br.mongo.model.Users;
import com.meli.br.mongo.repositorys.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void insert(Users user){
        usersRepository.insert(user);
    }

}
