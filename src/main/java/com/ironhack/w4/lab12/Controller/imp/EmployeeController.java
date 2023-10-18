package com.ironhack.w4.lab12.Controller.imp;

import com.ironhack.w4.lab12.Controller.Interface.IemployeeController;
import com.ironhack.w4.lab12.Model.Employee;
import com.ironhack.w4.lab12.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController implements IemployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/employee")
    public List<Employee> getAllDoctors () {
        return employeeRepository.findAll();
    }
    @GetMapping("/employee/{employeeId}")
    public Employee getDoctorById(@PathVariable Integer employeeId){
        Optional<Employee>employeeOptional=employeeRepository.findById(employeeId);
        if(employeeOptional.isEmpty())return  null;
        return employeeOptional.get();
    }
    @GetMapping("/employee/status")
    public List<Employee> getDoctorsByStatus(@PathVariable String status){
        return  employeeRepository.findByStatus(status);
    }@GetMapping("/employee/department")
    public List<Employee> getDoctorsByDepartment(@PathVariable String department){
        return  employeeRepository.findByDepartment(department);
    }
}
