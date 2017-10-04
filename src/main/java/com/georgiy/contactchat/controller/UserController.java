package com.georgiy.contactchat.controller;

import com.georgiy.contactchat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{login}")
    public ResponseEntity checkLogin(@PathVariable("login") String login){
        if(login==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login is empty");
        }
        return ResponseEntity.ok("Welcome, " + login);
    }
}
