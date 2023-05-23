/**
 * This class represents a FootballPlayer entity.
 */
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

    /**
     * Constructs a FootballPlayer object with the specified attributes.
     *
     * @param name     the name of the football player
     * @param age      the age of the football player
     * @param position the position of the football player
     * @param number   the number of the football player
     */
    public FootballPlayer(String name, int age, String position, int number) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.number = number;
    }

    /**
     * Default constructor for FootballPlayer.
     */
    public FootballPlayer() {

    }

    /**
     * Returns the ID of the football player.
     *
     * @return the ID of the football player
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the ID of the football player.
     *
     * @param id the ID to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Returns the name of the football player.
     *
     * @return the name of the football player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the football player.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of the football player.
     *
     * @return the age of the football player
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the football player.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the position of the football player.
     *
     * @return the position of the football player
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position of the football player.
     *
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Returns the number of the football player.
     *
     * @return the number of the football player
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the number of the football player.
     *
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
