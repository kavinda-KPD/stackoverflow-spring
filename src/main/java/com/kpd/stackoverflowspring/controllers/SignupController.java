package com.kpd.stackoverflowspring.controllers;

import com.kpd.stackoverflowspring.dtos.UserDTO;
import com.kpd.stackoverflowspring.dtos.signupDTO;
import com.kpd.stackoverflowspring.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/sign-up")
    public ResponseEntity<?> createUser(@RequestBody signupDTO signupDTO){

        UserDTO createdUser = userService.createUser(signupDTO);

        if (createdUser == null){
            return new ResponseEntity<>("User Not Created,Come Later", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdUser,HttpStatus.CREATED);
    }
}
