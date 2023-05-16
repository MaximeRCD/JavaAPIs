package org.tse.mr.restAPI.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FootballTeam {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String city;

    public FootballTeam(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public FootballTeam() {

    }

    public void setCity(String city) {
        this.city = city;
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

    public String getCity() {
        return city;
    }


}
