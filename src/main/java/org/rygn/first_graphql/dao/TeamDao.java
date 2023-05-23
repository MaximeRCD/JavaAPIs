/**
 * This class represents a data access object for Team objects.
 */
package org.rygn.first_graphql.dao;
import org.rygn.first_graphql.model.Team;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TeamDao {

	private List<Team> teams;

	/**
	 * Constructs a new TeamDao object with the given list of teams.
	 *
	 * @param teams the list of teams
	 */
	public TeamDao(List<Team> teams) {
		this.teams = teams;
	}

	/**
	 * Returns a list of all teams.
	 *
	 * @return the list of teams
	 */
	public List<Team> getAllTeams() {
		return this.teams;
	}

	/**
	 * Returns the team with the specified ID.
	 *
	 * @param id the ID of the team to retrieve
	 * @return the team with the specified ID, or null if not found
	 */
	public Team getTeamByID(String id) {
		Optional<Team> team = teams.stream().filter(p -> p.getId().equals(id)).findFirst();
		return team.orElse(null);
	}

	/**
	 * Creates a new team with the specified name and colors.
	 *
	 * @param name   the name of the team
	 * @param colors the colors of the team
	 * @return the newly created team
	 */
	public Team createTeam(String name, String colors) {
		Team newTeam = new Team();
		newTeam.setName(name);
		newTeam.setColors(colors);
		newTeam.setId(UUID.randomUUID().toString());
		this.teams.add(newTeam);
		return newTeam;
	}

	/**
	 * Updates the name of the team with the specified ID.
	 *
	 * @param id   the ID of the team to update
	 * @param name the new name of the team
	 * @return the updated team
	 * @throws Exception if the team with the specified ID is not found
	 */
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

	/**
	 * Saves the team to the list of teams.
	 *
	 * @param team the team to save
	 */
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
