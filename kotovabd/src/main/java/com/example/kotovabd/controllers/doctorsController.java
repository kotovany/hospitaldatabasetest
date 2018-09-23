package com.example.kotovabd.controllers;

import com.example.kotovabd.interfaces.doctorsRepository;
import com.example.kotovabd.tables.Doctors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class doctorsController {
    @Autowired
    private doctorsRepository doctorsRepository;

    @GetMapping("/doctors")
    public List<Doctors> retrieveAllDoctors() { return doctorsRepository.findAll(); }
}
