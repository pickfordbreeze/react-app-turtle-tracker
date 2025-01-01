package com.breeze.malama_backend.controller;

import com.breeze.malama_backend.model.BaskingIncident;
import com.breeze.malama_backend.repository.BaskingIncidentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BaskingIncidentController {

    @Autowired
    private BaskingIncidentRepository baskingIncidentRepository;

    @PostMapping("/BaskingIncident")
    BaskingIncident newBaskingIncident(@RequestBody BaskingIncident newIncident) {
        return baskingIncidentRepository.save(newIncident);
    }

    @GetMapping("/BaskingIncidents")
    List<BaskingIncident> getAllBaskingIncidents() {
        return baskingIncidentRepository.findAll();
    }

    @DeleteMapping("/BaskingIncident/{id}")
    void deleteBaskingIncident(@PathVariable Long id) {
        baskingIncidentRepository.deleteById(id);
    }
}