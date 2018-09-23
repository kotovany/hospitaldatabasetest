package com.example.kotovabd.controllers;


import com.example.kotovabd.interfaces.chambersRepository;
import com.example.kotovabd.tables.Chambers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class chambersController {

    @Autowired
    private chambersRepository chambersRepository;

    @GetMapping("/chambers")
    public List<Chambers> retrieveAllChambers() { return chambersRepository.findAll(); }
}
