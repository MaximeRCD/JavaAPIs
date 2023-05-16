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

    @GetMapping("/teams")
    public List<FootballTeam> allTeams() {

        return this.fbTservice.findAllTeams();
    }

    @GetMapping("/teams/{id}")
    public FootballTeam oneTeam(@PathVariable Integer id) {

        return this.fbTservice.findTeam(id);
    }

    @PostMapping("/teams")
    public FootballTeam createTeam(@RequestBody FootballTeam footballTeam) {

        return this.fbTservice.createTeam(footballTeam);
    }

    @DeleteMapping("/teams/{id}")
    public void deleteTeam(@PathVariable Integer id) {

        this.fbTservice.deleteTeam(id);
    }

    @PutMapping("/teams/{id}")
    FootballTeam replaceAnimal(@RequestBody FootballTeam footballTeam, @PathVariable Integer id) {

        FootballTeam foundTeam = this.fbTservice.findTeam(id);

        if (footballTeam != null) {

            foundTeam.setName(footballTeam.getName());

            foundTeam = this.fbTservice.saveTeam(foundTeam);
        }

        return foundTeam;
    }
}
