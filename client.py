import requests
import json

class GraphQLClient:
    def __init__(self, base_url = 'http://localhost:8080/graphql'):
        self.base_url = base_url
        self.headers = {'Content-Type': 'application/json'}

    def execute(self, query, variables=None):
        data = {'query': query}
        if variables:
            data['variables'] = variables
        response = requests.post(self.base_url, headers=self.headers, json=data)
        return response.json()

# Instanciation du client
client = GraphQLClient()

print("##################################### TEAMS #####################################")

# Team Requests
all_teams_query = '''
query{
    allTeams{
        id
        name
        colors
    }
}
'''
print(f"Request All Teams => {json.dumps(client.execute(all_teams_query), indent=4)}")

create_team_query = '''
mutation{
    createTeam(name:"Paris-Saint-Germain", colors:"Rouge et Bleu"){
        id
        name
        colors
    }
}
'''
print(f"Request Create Team Paris Saint Germain => {json.dumps(client.execute(create_team_query), indent=4)}")


create_team_response = client.execute(create_team_query)
team_id = create_team_response['data']['createTeam']['id']

update_team_query = f'''
mutation{{
    updateTeamName(id:"{team_id}", name:"PSG"){{
        id
        name
        colors
    }}
}}
'''
print(f"Request Update Team ParisSaintGermain with name  PSG => {json.dumps(client.execute(update_team_query), indent=4)}")


team_by_id_query = f'''
query{{
    teamByID(id:"{team_id}"){{
        name
    }}
}}
'''
print(f"Request Team of Id : {team_id} => {json.dumps(client.execute(team_by_id_query), indent=4)}")
print(f"Request All Teams => {json.dumps(client.execute(all_teams_query), indent=4)}")

print("##################################### PLAYERS #####################################")
# Player Requests
all_players_query = '''
query{
    allPlayers{
        id
        name
        position
        number
    }
}
'''
print(f"Request All players => {json.dumps(client.execute(all_players_query), indent=4)}")

create_player_query = '''
mutation{
    createPlayer(name:"Killian Mbappé", position:"BU", number:7){
        id
        name
        position
        number
    }
}
'''
print(f"Request Create Player Mbappé => {json.dumps(client.execute(create_player_query), indent=4)}")

create_player_response = client.execute(create_player_query)
player_id = create_player_response['data']['createPlayer']['id']

update_player_query = f'''
mutation{{
    updatePlayerName(id:"{player_id}", name:"Kyk's Mbappé"){{
        id
        name
        position
        number
    }}
}}
'''
print(f"Request Update Player Mbappé with name kik's => {json.dumps(client.execute(update_player_query), indent=4)}")


player_by_id_query = f'''
query{{
    playerByID(id:"{player_id}"){{
        name
    }}
}}
'''
print(f"Request Player of Id : {player_id} => {json.dumps(client.execute(player_by_id_query), indent=4)}")
print(f"Request All players => {json.dumps(client.execute(all_players_query), indent=4)}")
