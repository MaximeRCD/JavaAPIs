/**
 * This class represents a GraphQL mutation resolver for Team objects.
 */
package org.rygn.first_graphql.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.rygn.first_graphql.dao.TeamDao;
import org.rygn.first_graphql.model.Team;

import java.util.UUID;

public class TeamMutation implements GraphQLMutationResolver {
    private TeamDao teamDao;

    /**
     * Constructs a new TeamMutation object with the given TeamDao.
     *
     * @param teamDao the TeamDao to be used for data access
     */
    public TeamMutation(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    /**
     * Creates a new team with the specified name and colors.
     *
     * @param name   the name of the team
     * @param colors the colors of the team
     * @return the newly created team
     */
    public Team createTeam(String name, String colors) {
        Team team = teamDao.createTeam(name, colors);
        return team;
    }

    /**
     * Updates the name of the team with the specified ID.
     *
     * @param id   the ID of the team to update
     * @param name the new name of the team
     * @return the updated team
     * @throws Exception if the team with the specified ID is not found
     */
    public Team updateTeamName(String id, String name) throws Exception {
        // Call your service or data access layer to update the team name
        Team updatedTeam = teamDao.updateTeamName(id, name);
        return updatedTeam;
    }
}
