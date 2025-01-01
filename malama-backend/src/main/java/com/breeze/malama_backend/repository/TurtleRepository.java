package com.breeze.malama_backend.repository;

import com.breeze.malama_backend.model.Turtle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurtleRepository extends JpaRepository<Turtle, Long> {

}
