/**
 * This class represents a GraphQL query resolver for Team objects.
 */
package org.rygn.first_graphql.resolver;

import java.util.List;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.rygn.first_graphql.dao.TeamDao;
import org.rygn.first_graphql.model.Team;

public class TeamsQuery implements GraphQLQueryResolver {
    private TeamDao teamDao;

    /**
     * Constructs a new TeamsQuery object with the given TeamDao.
     *
     * @param teamDao the TeamDao to be used for data access
     */
    public TeamsQuery(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    /**
     * Returns a list of all teams.
     *
     * @return the list of teams
     */
    public List<Team> getAllTeams() {
        return this.teamDao.getAllTeams();
    }

    /**
     * Returns the team with the specified ID.
     *
     * @param id the ID of the team to retrieve
     * @return the team with the specified ID, or null if not found
     */
    public Team getTeamByID(String id) {
        return this.teamDao.getTeamByID(id);
    }
}
