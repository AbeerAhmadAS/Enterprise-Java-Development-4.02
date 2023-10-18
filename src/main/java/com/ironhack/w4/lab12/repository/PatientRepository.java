package com.ironhack.w4.lab12.repository;

import com.ironhack.w4.lab12.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

    List<Patient> findByDateOfBirthBetween(LocalDate startDate, LocalDate endDate);
    List<Patient> findByAdmittedByDepartment(String department);
    List<Patient> findByAdmittedByStatus (String status);
}
