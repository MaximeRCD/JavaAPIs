/**
 * This class provides an implementation of the FBTservice interface for FootballTeam entities.
 */
package org.tse.mr.restAPI.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tse.mr.restAPI.dao.FootballTeamRepository;
import org.tse.mr.restAPI.domain.FootballTeam;
import org.tse.mr.restAPI.services.FBTservice;

import java.util.List;

@Service
@Transactional
public class FBTimpl implements FBTservice {
    @Autowired
    private FootballTeamRepository footballTeamRepository;

    /**
     * Retrieves all FootballTeam entities.
     *
     * @return a list of FootballTeam entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<FootballTeam> findAllTeams() {
        return this.footballTeamRepository.findAll();
    }

    /**
     * Retrieves a specific FootballTeam entity by ID.
     *
     * @param id the ID of the FootballTeam entity to retrieve
     * @return the FootballTeam entity with the specified ID
     */
    @Override
    public FootballTeam findTeam(Integer id) {
        return this.footballTeamRepository.findById(id).orElse(null);
    }

    /**
     * Creates a new FootballTeam entity.
     *
     * @param footballTeam the FootballTeam entity to create
     * @return the created FootballTeam entity
     */
    @Override
    public FootballTeam createTeam(FootballTeam footballTeam) {
        return this.footballTeamRepository.save(footballTeam);
    }

    /**
     * Deletes a specific FootballTeam entity by ID.
     *
     * @param id the ID of the FootballTeam entity to delete
     */
    @Override
    public void deleteTeam(Integer id) {
        this.footballTeamRepository.deleteById(id);
    }

    /**
     * Saves an updated FootballTeam entity.
     *
     * @param foundFootballTeam the updated FootballTeam entity to save
     * @return the saved FootballTeam entity
     */
    @Override
    public FootballTeam saveTeam(FootballTeam foundFootballTeam) {
        return this.footballTeamRepository.save(foundFootballTeam);
    }
}
