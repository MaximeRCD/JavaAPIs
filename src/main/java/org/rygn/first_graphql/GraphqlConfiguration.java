package org.rygn.first_graphql;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.rygn.first_graphql.dao.PlayerDao;
import org.rygn.first_graphql.dao.TeamDao;
import org.rygn.first_graphql.model.Player;
import org.rygn.first_graphql.model.Team;
import org.rygn.first_graphql.resolver.PlayerMutation;
import org.rygn.first_graphql.resolver.PlayerQuery;
import org.rygn.first_graphql.resolver.TeamMutation;
import org.rygn.first_graphql.resolver.TeamsQuery;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {
	@Bean
	public TeamDao teamDao() {

		List<Team> teams = new ArrayList<>();

		Team team1 = new Team();
		team1.setId("FRA");
		team1.setName("France");
		team1.setColors("Bleu, blanc, rouge");
		teams.add(team1);

		Team team2 = new Team();
		team2.setId("SP");
		team2.setName("Spain");
		team2.setColors("Rouge, jaune");
		teams.add(team2);

		return new TeamDao(teams);
	}

	@Bean
	public PlayerDao playerDao() {

		List<Player> players = new ArrayList<>();

		Player player1 = new Player();
		player1.setId(UUID.randomUUID().toString());
		player1.setName("Marco Verratti");
		player1.setPosition("MDC");
		player1.setNumber(21);
		players.add(player1);

		Player player2 = new Player();
		player2.setId(UUID.randomUUID().toString());
		player2.setName("Nuno Mendes");
		player2.setPosition("DG");
		player2.setNumber(18);
		players.add(player2);

		return new PlayerDao(players);
	}


	@Bean
    public TeamsQuery teamsQuery(TeamDao teamDao) {
        return new TeamsQuery(teamDao);
    }

	@Bean
	public TeamMutation teamMutation(TeamDao teamDao){ return new TeamMutation(teamDao);}

	@Bean
	public PlayerQuery playerQuery(PlayerDao playerDao) {
		return new PlayerQuery(playerDao);
	}

	@Bean
	public PlayerMutation playerMutation(PlayerDao playerDao) {
		return new PlayerMutation(playerDao);
	}
}
