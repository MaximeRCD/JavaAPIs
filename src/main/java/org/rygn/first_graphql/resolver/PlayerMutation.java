package org.rygn.first_graphql.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.rygn.first_graphql.dao.PlayerDao;
import org.rygn.first_graphql.model.Player;

public class PlayerMutation implements GraphQLMutationResolver {
    private PlayerDao playerDao;

    public PlayerMutation( PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public Player createPlayer(String name, String position, Integer number) {
        return playerDao.createPlayer(name, position, number);
    }

    public Player updatePlayerName(String id, String name) throws Exception {
        return playerDao.updatePlayerName(id, name);
    }
}
