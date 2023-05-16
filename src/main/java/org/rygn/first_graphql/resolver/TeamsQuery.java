package org.rygn.first_graphql.resolver;

import java.util.List;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.rygn.first_graphql.dao.TeamDao;
import org.rygn.first_graphql.model.Team;


public class TeamsQuery implements GraphQLQueryResolver {

	private TeamDao teamDao;

    public TeamsQuery(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public List<Team> getAllTeams() {
        return this.teamDao.getAllTeams();
    }
    public Team getTeamByID (String id) {
        return this.teamDao.getTeamByID(id);
    }

}
