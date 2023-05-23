/**
 * This interface represents a service for FootballPlayer entities.
 */
package org.tse.mr.restAPI.services;

import org.springframework.stereotype.Service;
import org.tse.mr.restAPI.domain.FootballPlayer;

import java.util.List;

public interface FBPservice {
    /**
     * Retrieves all FootballPlayer entities.
     *
     * @return a list of FootballPlayer entities
     */
    public List<FootballPlayer> findAllPlayers();

    /**
     * Retrieves a specific FootballPlayer entity by ID.
     *
     * @param id the ID of the FootballPlayer entity to retrieve
     * @return the FootballPlayer entity with the specified ID
     */
    public FootballPlayer findPlayer(Integer id);

    /**
     * Creates a new FootballPlayer entity.
     *
     * @param footballPlayer the FootballPlayer entity to create
     * @return the created FootballPlayer entity
     */
    public FootballPlayer createPlayers(FootballPlayer footballPlayer);

    /**
     * Deletes a specific FootballPlayer entity by ID.
     *
     * @param id the ID of the FootballPlayer entity to delete
     */
    public void deletePlayer(Integer id);

    /**
     * Saves an updated FootballPlayer entity.
     *
     * @param foundFootballPlayer the updated FootballPlayer entity to save
     * @return the saved FootballPlayer entity
     */
    public FootballPlayer savePlayer(FootballPlayer foundFootballPlayer);
}
