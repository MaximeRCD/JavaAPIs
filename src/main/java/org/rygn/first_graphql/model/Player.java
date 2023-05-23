/**
 * This class represents a Player.
 */
package org.rygn.first_graphql.model;

public class Player {
    private String id;
    private String name;
    private String position;
    private Integer number;

    /**
     * Returns the ID of the player.
     *
     * @return the ID of the player
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the player.
     *
     * @param id the ID of the player
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the name of the player.
     *
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name the name of the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the position of the player.
     *
     * @return the position of the player
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position of the player.
     *
     * @param position the position of the player
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Returns the number of the player.
     *
     * @return the number of the player
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the number of the player.
     *
     * @param number the number of the player
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}
