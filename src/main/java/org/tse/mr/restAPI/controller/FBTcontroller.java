/**
 * This class represents a controller for FootballTeam resources.
 */
package org.tse.mr.restAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tse.mr.restAPI.domain.FootballTeam;
import org.tse.mr.restAPI.services.FBTservice;

import java.util.List;

@RestController
public class FBTcontroller {
    @Autowired
    private FBTservice fbTservice;

    /**
     * Retrieves all FootballTeam resources.
     *
     * @return a list of FootballTeam resources
     */
    @GetMapping("/teams")
    public List<FootballTeam> allTeams() {
        return this.fbTservice.findAllTeams();
    }

    /**
     * Retrieves a specific FootballTeam resource by ID.
     *
     * @param id the ID of the FootballTeam resource to retrieve
     * @return the FootballTeam resource with the specified ID
     */
    @GetMapping("/teams/{id}")
    public FootballTeam oneTeam(@PathVariable Integer id) {
        return this.fbTservice.findTeam(id);
    }

    /**
     * Creates a new FootballTeam resource.
     *
     * @param footballTeam the FootballTeam resource to create
     * @return the created FootballTeam resource
     */
    @PostMapping("/teams")
    public FootballTeam createTeam(@RequestBody FootballTeam footballTeam) {
        return this.fbTservice.createTeam(footballTeam);
    }

    /**
     * Deletes a specific FootballTeam resource by ID.
     *
     * @param id the ID of the FootballTeam resource to delete
     */
    @DeleteMapping("/teams/{id}")
    public void deleteTeam(@PathVariable Integer id) {
        this.fbTservice.deleteTeam(id);
    }

    /**
     * Replaces a specific FootballTeam resource with new data.
     *
     * @param footballTeam the new data for the FootballTeam resource
     * @param id           the ID of the FootballTeam resource to replace
     * @return the updated FootballTeam resource
     */
    @PutMapping("/teams/{id}")
    FootballTeam replaceAnimal(@RequestBody FootballTeam footballTeam, @PathVariable Integer id) {
        FootballTeam foundTeam = this.fbTservice.findTeam(id);

        if (foundTeam != null) {
            foundTeam.setName(footballTeam.getName());
            foundTeam = this.fbTservice.saveTeam(foundTeam);
        }

        return foundTeam;
    }
}
