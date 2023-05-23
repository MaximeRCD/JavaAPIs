/**
 * This interface represents a service for FootballTeam entities.
 */
package org.tse.mr.restAPI.services;

import org.tse.mr.restAPI.domain.FootballTeam;

import java.util.List;

public interface FBTservice {
    /**
     * Retrieves all FootballTeam entities.
     *
     * @return a list of FootballTeam entities
     */
    public List<FootballTeam> findAllTeams();

    /**
     * Retrieves a specific FootballTeam entity by ID.
     *
     * @param id the ID of the FootballTeam entity to retrieve
     * @return the FootballTeam entity with the specified ID
     */
    public FootballTeam findTeam(Integer id);

    /**
     * Creates a new FootballTeam entity.
     *
     * @param footballTeam the FootballTeam entity to create
     * @return the created FootballTeam entity
     */
    public FootballTeam createTeam(FootballTeam footballTeam);

    /**
     * Deletes a specific FootballTeam entity by ID.
     *
     * @param id the ID of the FootballTeam entity to delete
     */
    public void deleteTeam(Integer id);

    /**
     * Saves an updated FootballTeam entity.
     *
     * @param foundFootballTeam the updated FootballTeam entity to save
     * @return the saved FootballTeam entity
     */
    public FootballTeam saveTeam(FootballTeam foundFootballTeam);
}
