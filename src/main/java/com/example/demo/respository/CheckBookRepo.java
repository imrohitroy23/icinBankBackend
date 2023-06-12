package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Checkbook;

@Repository
public interface CheckBookRepo extends JpaRepository<Checkbook,Integer> {
    @Query(value = "select c.id,c.uid,c.reason,c.pages,u.account_number,u.first_name,u.last_name,u.email,u.mobile_no from check_requests as c inner join user as u on c.uid=u.id where c.status =\"Requested\"", nativeQuery = true)
    public List<Object> findByStatus(String status);
    
}
