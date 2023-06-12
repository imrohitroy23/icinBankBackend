package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    public User findByEmailAndPasswordAndStatus(String email, String password,String status);
	public List<User> findAllByStatus(String status);
	public User findByAccountNumber(String accountNumber);
}
