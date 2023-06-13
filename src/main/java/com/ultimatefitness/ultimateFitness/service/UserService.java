package com.ultimatefitness.ultimateFitness.service;


import com.ultimatefitness.ultimateFitness.model.User;
import com.ultimatefitness.ultimateFitness.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> listUser(){
        return userRepo.findAll();
    }


}
