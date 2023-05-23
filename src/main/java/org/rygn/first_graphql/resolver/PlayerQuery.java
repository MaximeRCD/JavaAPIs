/**
 * This class represents a GraphQL query resolver for Player objects.
 */
package org.rygn.first_graphql.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.rygn.first_graphql.dao.PlayerDao;
import org.rygn.first_graphql.model.Player;

import java.util.List;

public class PlayerQuery implements GraphQLQueryResolver {
    private PlayerDao playerDao;

    /**
     * Constructs a new PlayerQuery object with the given PlayerDao.
     *
     * @param playerDao the PlayerDao to be used for data access
     */
    public PlayerQuery(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    /**
     * Returns a list of all players.
     *
     * @return the list of players
     */
    public List<Player> allPlayers() {
        return playerDao.getAllPlayers();
    }

    /**
     * Returns the player with the specified ID.
     *
     * @param id the ID of the player to retrieve
     * @return the player with the specified ID, or null if not found
     */
    public Player playerByID(String id) {
        return playerDao.getPlayerByID(id);
    }
}
