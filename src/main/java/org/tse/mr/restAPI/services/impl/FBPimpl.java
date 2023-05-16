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

    @Override
    @Transactional(readOnly = true)
    public List<FootballPlayer> findAllPlayers() {
        return this.footballPlayerRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public FootballPlayer findPlayer(Integer id) {
        return this.footballPlayerRepository.findById(id).orElse(null);
    }

    @Override
    public FootballPlayer createPlayers(FootballPlayer footballPlayer) {
        return this.footballPlayerRepository.save(footballPlayer);
    }

    @Override
    public void deletePlayer(Integer id) {
        this.footballPlayerRepository.deleteById(id);
    }

    @Override
    public FootballPlayer savePlayer(FootballPlayer foundFootballPlayer) {
        return this.footballPlayerRepository.save(foundFootballPlayer);
    }
}
