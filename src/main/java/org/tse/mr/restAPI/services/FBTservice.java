package org.tse.mr.restAPI.services;
import org.tse.mr.restAPI.domain.FootballTeam;

import java.util.List;

public interface FBTservice {
    public List<FootballTeam> findAllTeams();

    public FootballTeam findTeam(Integer id);

    public FootballTeam createTeam(FootballTeam footballTeam);

    public void deleteTeam(Integer id);

    public FootballTeam saveTeam(FootballTeam foundFootballTeam);
}
