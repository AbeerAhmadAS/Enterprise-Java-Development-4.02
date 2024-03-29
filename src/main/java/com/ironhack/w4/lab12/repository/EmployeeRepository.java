package com.ironhack.w4.lab12.repository;

import com.ironhack.w4.lab12.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findByStatus(String status);
    public List<Employee> findByDepartment(String department);



}
