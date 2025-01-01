package com.breeze.malama_backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Basking_incident")
public class BaskingIncident {
    @Id
    @GeneratedValue
    private Long incidentId;

    private String turtleId;
    private LocalDate date;
    private LocalTime timeOnBeach;
    private LocalTime timeOffBeach;

    public Long getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
    }

    public String getTurtleId() {
        return turtleId;
    }

    public void setTurtleId(String turtleId) {
        this.turtleId = turtleId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTimeOnBeach() {
        return timeOnBeach;
    }

    public void setTimeOnBeach(LocalTime timeOnBeach) {
        this.timeOnBeach = timeOnBeach;
    }

    public LocalTime getTimeOffBeach() {
        return timeOffBeach;
    }

    public void setTimeOffBeach(LocalTime timeOffBeach) {
        this.timeOffBeach = timeOffBeach;
    }
}
