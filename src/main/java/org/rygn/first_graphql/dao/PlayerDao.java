package org.rygn.first_graphql.dao;

import org.rygn.first_graphql.model.Player;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PlayerDao {
    private List<Player> players;

    public PlayerDao(List<Player> players) {
        this.players = players;
    }

    public List<Player> getAllPlayers() {
        return this.players;
    }

    public Player getPlayerByID(String id) {
        Optional<Player> player = players.stream().filter(p -> p.getId().equals(id)).findFirst();
        return player.orElse(null);
    }

    public Player createPlayer(String name, String position, Integer number) {
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNumber(number);
        newPlayer.setId(UUID.randomUUID().toString());
        this.players.add(newPlayer);
        return newPlayer;
    }

    public Player updatePlayerName(String id, String name) throws Exception {
        // Find the player by ID
        Player player = getPlayerByID(id);
        if (player == null) {
            throw new Exception("Player not found");
        }

        // Update the player name
        player.setName(name);

        // Save the updated player
        savePlayer(player);

        return player;
    }

    private void savePlayer(Player player) {
        // Find the player index in the list
        int playerIndex = -1;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId().equals(player.getId())) {
                playerIndex = i;
                break;
            }
        }

        // Update the player if found
        if (playerIndex != -1) {
            players.set(playerIndex, player);
        }
    }
}

