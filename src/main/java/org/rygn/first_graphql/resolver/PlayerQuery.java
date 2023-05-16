package org.rygn.first_graphql.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.rygn.first_graphql.dao.PlayerDao;
import org.rygn.first_graphql.model.Player;

import java.util.List;

public class PlayerQuery implements GraphQLQueryResolver {
    private PlayerDao playerDao;

    public PlayerQuery(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public List<Player> allPlayers() {
        return playerDao.getAllPlayers();
    }

    public Player playerByID(String id) {
        return playerDao.getPlayerByID(id);
    }
}
