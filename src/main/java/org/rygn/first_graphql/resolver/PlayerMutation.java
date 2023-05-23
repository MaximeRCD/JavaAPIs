/**
 * This class represents a GraphQL mutation resolver for Player objects.
 */
package org.rygn.first_graphql.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.rygn.first_graphql.dao.PlayerDao;
import org.rygn.first_graphql.model.Player;

public class PlayerMutation implements GraphQLMutationResolver {
    private PlayerDao playerDao;

    /**
     * Constructs a new PlayerMutation object with the given PlayerDao.
     *
     * @param playerDao the PlayerDao to be used for data access
     */
    public PlayerMutation(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    /**
     * Creates a new player with the specified name, position, and number.
     *
     * @param name     the name of the player
     * @param position the position of the player
     * @param number   the number of the player
     * @return the newly created player
     */
    public Player createPlayer(String name, String position, Integer number) {
        return playerDao.createPlayer(name, position, number);
    }

    /**
     * Updates the name of the player with the specified ID.
     *
     * @param id   the ID of the player to update
     * @param name the new name of the player
     * @return the updated player
     * @throws Exception if the player with the specified ID is not found
     */
    public Player updatePlayerName(String id, String name) throws Exception {
        return playerDao.updatePlayerName(id, name);
    }
}
