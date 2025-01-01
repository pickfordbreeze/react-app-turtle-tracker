package com.breeze.malama_backend.controller;

import com.breeze.malama_backend.model.Turtle;
import com.breeze.malama_backend.repository.TurtleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TurtleController {

    @Autowired
    private TurtleRepository turtleRepository;

    @PostMapping("/Turtle")
    Turtle newTurtle(@RequestBody Turtle newTurtle) {
        return turtleRepository.save(newTurtle);
    }

    @GetMapping("/Turtles")
    List<Turtle> getAllTurtle() {
        return turtleRepository.findAll();
    }

    @DeleteMapping("/Turtle/{id}")
    void deleteBaskingIncident(@PathVariable Long id) {
        turtleRepository.deleteById(id);
    }
}
