package com.example.Redis_Demo2.services;


import com.example.Redis_Demo2.dto.UserDTO;
import com.example.Redis_Demo2.entities.User;
import com.example.Redis_Demo2.mapper.UserMapper;
import com.example.Redis_Demo2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    @Cacheable(value="users",key="#id")
    public UserDTO getUserById(Integer id){
        System.out.println("Fetching from DB");
        User user=userRepo.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        return UserMapper.toDTO(user);
    }


    public UserDTO createUser(UserDTO dto){
        User user=new User();
        user.setName(dto.getName());
        user.setSalary(dto.getSalary());
        user= userRepo.save(user);
        return UserMapper.toDTO(user);
    }


    @CachePut(value="users",key="#dto.getId()")
    public UserDTO updateUser(UserDTO dto){
        User existing=userRepo.findById(dto.getId())
                .orElseThrow(()->new RuntimeException("User not found"));
        existing.setName(dto.getName());
        existing.setSalary(dto.getSalary());
        User updated= userRepo.save(existing);
        return UserMapper.toDTO(updated);
    }


    @CacheEvict(value="users",key="#id")
    public void deleteUser(Integer id){
        User user=userRepo.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        userRepo.delete(user);
    }
}
