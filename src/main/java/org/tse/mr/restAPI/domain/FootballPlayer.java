package org.tse.mr.restAPI.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FootballPlayer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int age;
    private String position;
    private int number;

    public FootballPlayer(String name, int age, String position, int number) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.number = number;
    }

    public FootballPlayer() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
