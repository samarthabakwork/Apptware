package com.example.Redis_Demo2.mapper;

import com.example.Redis_Demo2.dto.UserDTO;
import com.example.Redis_Demo2.entities.User;

public class UserMapper {

    public static UserDTO toDTO(User user){
        if(user==null) return null;

        UserDTO dto=new UserDTO();
        if (user.getId()!=null) {
            dto.setId(user.getId());
        }
        dto.setName(user.getName());
        dto.setSalary(user.getSalary());
        return dto;
    }


    public static User toEntity(UserDTO dto){
        if(dto==null) return null;
        User user=new User();
        if (dto.getId()!=null) {
            user.setId(dto.getId());
        }
        user.setName(dto.getName());
        user.setSalary(dto.getSalary());
        return user;
    }
}
