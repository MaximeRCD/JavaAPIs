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

    @Override
    @Transactional(readOnly = true)
    public List<FootballTeam> findAllTeams() {
        return this.footballTeamRepository.findAll();
    }

    @Override
    public FootballTeam findTeam(Integer id) {
        return this.footballTeamRepository.findById(id).orElse(null);
    }

    @Override
    public FootballTeam createTeam(FootballTeam footballTeam) {
        return this.footballTeamRepository.save(footballTeam);
    }

    @Override
    public void deleteTeam(Integer id) {
        this.footballTeamRepository.deleteById(id);
    }

    @Override
    public FootballTeam saveTeam(FootballTeam foundFootballTeam) {
        return this.footballTeamRepository.save(foundFootballTeam);
    }
}
