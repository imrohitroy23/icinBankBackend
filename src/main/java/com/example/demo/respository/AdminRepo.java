package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer>{
    public Admin findByUserNameAndPassword(String userName, String password);
}
