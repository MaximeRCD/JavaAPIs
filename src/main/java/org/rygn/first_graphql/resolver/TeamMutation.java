package org.rygn.first_graphql.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.rygn.first_graphql.dao.TeamDao;
import org.rygn.first_graphql.model.Team;

import java.util.UUID;

public class TeamMutation implements GraphQLMutationResolver {
    private TeamDao teamDao;

    public TeamMutation(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public Team createTeam(String name, String colors){
       Team team = teamDao.createTeam(name, colors);
       return team;
    }

    public Team updateTeamName(String id, String name) throws Exception {
        // Call your service or data access layer to update the team name
        Team updatedTeam = teamDao.updateTeamName(id, name);
        return updatedTeam;
    }

}

