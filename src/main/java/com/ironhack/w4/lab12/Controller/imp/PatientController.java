package com.ironhack.w4.lab12.Controller.imp;

import com.ironhack.w4.lab12.Controller.Interface.IpatirntController;
import com.ironhack.w4.lab12.Model.Patient;
import com.ironhack.w4.lab12.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PatientController implements IpatirntController {
    @Autowired
    PatientRepository patientRepository;
    @Override
    @GetMapping("/patient")
    public List<Patient> getAllPatient () {
        return patientRepository.findAll();
    }
    @Override
    @GetMapping("/patient/{patientId}")
    public Patient getPatientById(@PathVariable Integer patientId){
        Optional<Patient> patientOptional=patientRepository.findById(patientId);
        if(patientOptional.isEmpty())return  null;
        return patientOptional.get();
    }
    @Override
    @GetMapping("/patient/birthday")
    public List<Patient> getPatientByDateOfBirthRange(
            @RequestParam(defaultValue = "1970-01-01") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startRange,
            @RequestParam (defaultValue = "2000-01-01") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endRange
    ){
        return patientRepository.findByDateOfBirthBetween(startRange,endRange);
    }
    @Override
    @GetMapping("/patient/department/{department}")
    public List<Patient> getPatientByEmployeeDepartment(@PathVariable String department) {
        return patientRepository.findByAdmittedByDepartment(department);
    }

    @Override
    @GetMapping("/patient/off-status")
    public List<Patient> getPatientWithEmployeeStatusOFF() {
        return patientRepository.findByAdmittedByStatus("OFF");
    }
}
