package com.breeze.malama_backend.controller;

import com.breeze.malama_backend.model.BaskingIncident;
import com.breeze.malama_backend.repository.BaskingIncidentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaskingIncidentController {

    @Autowired
    private BaskingIncidentRepository baskingIncidentRepository;

    @PostMapping("/Basking_incident")
    BaskingIncident newIncident(@RequestBody BaskingIncident newIncident) {
        return baskingIncidentRepository.save(newIncident);
    }

}
