package com.ultimatefitness.ultimateFitness.controller;



import com.ultimatefitness.ultimateFitness.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
private User user;
    @RequestMapping("/hello")
    @ResponseBody
    public String helloGFG(){
        return "Hello GeeksForGeeks";
    }

}
