package com.example.Redis_Demo2.controllers;

import com.example.Redis_Demo2.dto.UserDTO;
import com.example.Redis_Demo2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserDTO create(@RequestBody UserDTO dto) {
        return userService.createUser(dto);
    }

    @GetMapping("/{id}")
    public UserDTO get(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PutMapping("/update")
    public UserDTO update(@RequestBody UserDTO dto) {
        return userService.updateUser(dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "Deleted";
    }
}
