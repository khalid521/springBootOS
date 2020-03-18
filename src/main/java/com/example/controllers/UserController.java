package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @RequestMapping(value = {"/api/user"}, method = RequestMethod.GET)
    public ResponseEntity<User> testUser()
    {

        User u = new User("Amani521");

        return ResponseEntity.ok(u);
        // return ResponseEntity.ok("Hello Controller!");
    }

}

class User {
    
    private String userName;

    User(String userName){
        this.userName = userName;
    }



    public String getUserName() {
        return this.userName;
    }

}