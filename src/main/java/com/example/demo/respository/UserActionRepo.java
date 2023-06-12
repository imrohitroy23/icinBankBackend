package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.UserAction;

@Repository
public interface UserActionRepo extends JpaRepository<UserAction,Integer>{
    
}
