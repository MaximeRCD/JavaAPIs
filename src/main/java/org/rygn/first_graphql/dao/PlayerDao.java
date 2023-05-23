/**
 * This class represents a data access object for Player objects.
 */
package org.rygn.first_graphql.dao;
import org.rygn.first_graphql.model.Player;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PlayerDao {
    private List<Player> players;

    /**
     * Constructs a new PlayerDao object with the given list of players.
     *
     * @param players the list of players
     */
    public PlayerDao(List<Player> players) {
        this.players = players;
    }

    /**
     * Returns a list of all players.
     *
     * @return the list of players
     */
    public List<Player> getAllPlayers() {
        return this.players;
    }

    /**
     * Returns the player with the specified ID.
     *
     * @param id the ID of the player to retrieve
     * @return the player with the specified ID, or null if not found
     */
    public Player getPlayerByID(String id) {
        Optional<Player> player = players.stream().filter(p -> p.getId().equals(id)).findFirst();
        return player.orElse(null);
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
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNumber(number);
        newPlayer.setId(UUID.randomUUID().toString());
        this.players.add(newPlayer);
        return newPlayer;
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

    /**
     * Saves the player to the list of players.
     *
     * @param player the player to save
     */
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
