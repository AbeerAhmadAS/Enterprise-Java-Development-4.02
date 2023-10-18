package com.ironhack.w4.lab12.Model;

import com.ironhack.w4.lab12.Model.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String name;
    private Date dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "admitted_by")
    private Employee admittedBy;



}