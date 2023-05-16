package org.rygn.first_graphql.dao;

import org.rygn.first_graphql.model.Team;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TeamDao {

	private List<Team> teams;
	
	public TeamDao(List<Team> teams) {

		this.teams = teams;
	}

	public List<Team> getAllTeams() {
		
		return this.teams;
	}
	public Team getTeamByID(String _id) {
		Optional<Team> team = teams.stream().filter(p -> p.getId().equals(_id)).findFirst();
		return team.orElse(null);
	}

	public Team createTeam(String name, String colors){
		Team new_team = new Team();
		new_team.setName(name);
		new_team.setColors(colors);
		new_team.setId(UUID.randomUUID().toString());
		this.teams.add(new_team);
		return new_team;
	}

	public Team updateTeamName(String id, String name) throws Exception {
		// Find the team by ID
		Team team = getTeamByID(id);
		if (team == null) {
			throw new Exception("Team not found");
		}

		// Update the team name
		team.setName(name);

		// Save the updated team
		saveTeam(team);

		return team;
	}
	private void saveTeam(Team team) {
		// Find the team index in the list
		int teamIndex = -1;
		for (int i = 0; i < teams.size(); i++) {
			if (teams.get(i).getId().equals(team.getId())) {
				teamIndex = i;
				break;
			}
		}

		// Update the team if found
		if (teamIndex != -1) {
			teams.set(teamIndex, team);
		}
	}


}
