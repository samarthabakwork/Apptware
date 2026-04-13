package com.example.InBuiltValidation.services;

import com.example.InBuiltValidation.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String createUser(UserDTO userDTO){
        return "User created successfully";
    }

}
