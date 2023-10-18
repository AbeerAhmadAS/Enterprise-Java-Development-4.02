package com.ironhack.w4.lab12.Controller.Interface;

import com.ironhack.w4.lab12.Model.Patient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

public interface IpatirntController {
    public List<Patient> getAllPatient ();
    public Patient getPatientById( Integer patientId);
    public List<Patient> getPatientByDateOfBirthRange(LocalDate startRange, LocalDate endRange);
    public List<Patient> getPatientByEmployeeDepartment(String department);
    public List<Patient> getPatientWithEmployeeStatusOFF();



    }
