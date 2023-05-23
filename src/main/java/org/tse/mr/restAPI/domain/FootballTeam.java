/**
 * This class represents a FootballTeam entity.
 */
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

    /**
     * Constructs a FootballTeam object with the specified attributes.
     *
     * @param name the name of the football team
     * @param city the city of the football team
     */
    public FootballTeam(String name, String city) {
        this.name = name;
        this.city = city;
    }

    /**
     * Default constructor for FootballTeam.
     */
    public FootballTeam() {

    }

    /**
     * Sets the city of the football team.
     *
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the ID of the football team.
     *
     * @return the ID of the football team
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the ID of the football team.
     *
     * @param id the ID to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Returns the name of the football team.
     *
     * @return the name of the football team
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the football team.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the city of the football team.
     *
     * @return the city of the football team
     */
    public String getCity() {
        return city;
    }
}
