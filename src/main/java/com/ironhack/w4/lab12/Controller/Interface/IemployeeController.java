package com.ironhack.w4.lab12.Controller.Interface;

import com.ironhack.w4.lab12.Model.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IemployeeController {
    public List<Employee> getAllDoctors ();
    public Employee getDoctorById (Integer employeeId);
    public List<Employee> getDoctorsByStatus( String status);
    public List<Employee> getDoctorsByDepartment(String department);
}
