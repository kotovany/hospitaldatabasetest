package com.example.kotovabd.controllers;

import com.example.kotovabd.interfaces.patientsRepository;
import com.example.kotovabd.tables.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class patientsController {

    @Autowired
    private patientsRepository patientsRepository;

    @GetMapping("/patients")
    public List<Patients> retrieveAllPatients() { return patientsRepository.findAll(); }
}
