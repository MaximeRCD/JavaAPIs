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

    @GetMapping("/players")
    public List<FootballPlayer> allTeams() {

        return this.fbPservice.findAllPlayers();
    }

    @GetMapping("/players/{id}")
    public FootballPlayer oneTeam(@PathVariable Integer id) {

        return this.fbPservice.findPlayer(id);
    }

    @PostMapping("/players")
    public FootballPlayer createTeam(@RequestBody FootballPlayer footballPlayer) {

        return this.fbPservice.createPlayers(footballPlayer);
    }

    @DeleteMapping("/players/{id}")
    public void deleteTeam(@PathVariable Integer id) {

        this.fbPservice.deletePlayer(id);
    }

    @PutMapping("/players/{id}")
    FootballPlayer replacePlayer(@RequestBody FootballPlayer footballPlayer, @PathVariable Integer id) {

        FootballPlayer foundPlayer = this.fbPservice.findPlayer(id);

        if (footballPlayer != null) {

            foundPlayer.setName(footballPlayer.getName());

            foundPlayer = this.fbPservice.savePlayer(foundPlayer);
        }

        return foundPlayer;
    }
}
