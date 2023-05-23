/**
 * This class represents a controller for FootballPlayer resources.
 */
package org.tse.mr.restAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tse.mr.restAPI.domain.FootballPlayer;
import org.tse.mr.restAPI.services.FBPservice;

import java.util.List;

@RestController
public class FBPcontroller {
    @Autowired
    private FBPservice fbPservice;

    /**
     * Retrieves all FootballPlayer resources.
     *
     * @return a list of FootballPlayer resources
     */
    @GetMapping("/players")
    public List<FootballPlayer> allTeams() {
        return this.fbPservice.findAllPlayers();
    }

    /**
     * Retrieves a specific FootballPlayer resource by ID.
     *
     * @param id the ID of the FootballPlayer resource to retrieve
     * @return the FootballPlayer resource with the specified ID
     */
    @GetMapping("/players/{id}")
    public FootballPlayer oneTeam(@PathVariable Integer id) {
        return this.fbPservice.findPlayer(id);
    }

    /**
     * Creates a new FootballPlayer resource.
     *
     * @param footballPlayer the FootballPlayer resource to create
     * @return the created FootballPlayer resource
     */
    @PostMapping("/players")
    public FootballPlayer createTeam(@RequestBody FootballPlayer footballPlayer) {
        return this.fbPservice.createPlayers(footballPlayer);
    }

    /**
     * Deletes a specific FootballPlayer resource by ID.
     *
     * @param id the ID of the FootballPlayer resource to delete
     */
    @DeleteMapping("/players/{id}")
    public void deleteTeam(@PathVariable Integer id) {
        this.fbPservice.deletePlayer(id);
    }

    /**
     * Replaces a specific FootballPlayer resource with new data.
     *
     * @param footballPlayer the new data for the FootballPlayer resource
     * @param id             the ID of the FootballPlayer resource to replace
     * @return the updated FootballPlayer resource
     */
    @PutMapping("/players/{id}")
    FootballPlayer replacePlayer(@RequestBody FootballPlayer footballPlayer, @PathVariable Integer id) {
        FootballPlayer foundPlayer = this.fbPservice.findPlayer(id);

        if (foundPlayer != null) {
            foundPlayer.setName(footballPlayer.getName());
            foundPlayer = this.fbPservice.savePlayer(foundPlayer);
        }

        return foundPlayer;
    }
}
