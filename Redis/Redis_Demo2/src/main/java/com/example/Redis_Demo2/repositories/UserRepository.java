package com.example.Redis_Demo2.repositories;

import com.example.Redis_Demo2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
