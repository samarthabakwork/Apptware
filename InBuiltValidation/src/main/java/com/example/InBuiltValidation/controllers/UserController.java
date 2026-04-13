package com.example.InBuiltValidation.controllers;

import com.example.InBuiltValidation.dto.UserDTO;
import com.example.InBuiltValidation.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
 private UserService userService;

 @PostMapping("/create")
 public String createUser(@Valid @RequestBody UserDTO userDTO){
     return userService.createUser(userDTO);
 }
}
