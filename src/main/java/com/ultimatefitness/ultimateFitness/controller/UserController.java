package com.ultimatefitness.ultimateFitness.controller;


import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private final User users;



    @RequestMapping("/hello")
    @ResponseBody
    public String helloGFG(){
        return "Hello GeeksForGeeks";
    }

}
