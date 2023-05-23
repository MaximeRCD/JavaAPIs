/**
 * This class provides an implementation of the FBPservice interface for FootballPlayer entities.
 */
package org.tse.mr.restAPI.services.impl;

import org.tse.mr.restAPI.dao.FootballPlayerRepository;
import org.tse.mr.restAPI.domain.FootballPlayer;
import org.tse.mr.restAPI.services.FBPservice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
@Transactional
public class FBPimpl implements FBPservice {

    @Autowired
    private FootballPlayerRepository footballPlayerRepository;

    /**
     * Retrieves all FootballPlayer entities.
     *
     * @return a list of FootballPlayer entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<FootballPlayer> findAllPlayers() {
        return this.footballPlayerRepository.findAll();
    }

    /**
     * Retrieves a specific FootballPlayer entity by ID.
     *
     * @param id the ID of the FootballPlayer entity to retrieve
     * @return the FootballPlayer entity with the specified ID
     */
    @Override
    @Transactional(readOnly = true)
    public FootballPlayer findPlayer(Integer id) {
        return this.footballPlayerRepository.findById(id).orElse(null);
    }

    /**
     * Creates a new FootballPlayer entity.
     *
     * @param footballPlayer the FootballPlayer entity to create
     * @return the created FootballPlayer entity
     */
    @Override
    public FootballPlayer createPlayers(FootballPlayer footballPlayer) {
        return this.footballPlayerRepository.save(footballPlayer);
    }

    /**
     * Deletes a specific FootballPlayer entity by ID.
     *
     * @param id the ID of the FootballPlayer entity to delete
     */
    @Override
    public void deletePlayer(Integer id) {
        this.footballPlayerRepository.deleteById(id);
    }

    /**
     * Saves an updated FootballPlayer entity.
     *
     * @param foundFootballPlayer the updated FootballPlayer entity to save
     * @return the saved FootballPlayer entity
     */
    @Override
    public FootballPlayer savePlayer(FootballPlayer foundFootballPlayer) {
        return this.footballPlayerRepository.save(foundFootballPlayer);
    }
}
