package org.tse.mr.restAPI.services;

import org.springframework.stereotype.Service;
import org.tse.mr.restAPI.domain.FootballPlayer;

import java.util.List;

public interface FBPservice {
    public List<FootballPlayer> findAllPlayers();

    public FootballPlayer findPlayer(Integer id);

    public FootballPlayer createPlayers(FootballPlayer footballPlayer);

    public void deletePlayer(Integer id);

    public FootballPlayer savePlayer(FootballPlayer foundFootballPlayer);
}
