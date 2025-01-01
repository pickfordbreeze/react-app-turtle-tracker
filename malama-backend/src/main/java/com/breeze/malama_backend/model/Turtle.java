package com.breeze.malama_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Turtle")
public class Turtle {
    @Id
    @GeneratedValue
    private Long turtleId;
    private String name;
    private String nameId;
    private int age;
    private String sex;
    private String story;
    private LocalDate firstSeenDate;

    public Long getturtleId() {
        return turtleId;
    }

    public void setturtleId(Long turtleId) {
        this.turtleId = turtleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public LocalDate getFirstSeenDate() {
        return firstSeenDate;
    }

    public void setFirstSeenDate(LocalDate firstSeenDate) {
        this.firstSeenDate = firstSeenDate;
    }
}