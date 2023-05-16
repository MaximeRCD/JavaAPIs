import requests
import pandas as pd

def get_all_teams():
    response = requests.get("http://localhost:8080/teams")
    if response.status_code == 200:
        data = response.json()
        df = pd.DataFrame(data)
        print("###################################################\n")
        print("Retrieving all teams\n")
        print("The teams are : ")
        print(df)
        print("###################################################\n")
    elif response.status_code == 404:
        print('Not Found.')

def post_one_team(data):
    print(f"Posting a new team {data}\n")
    response = requests.post("http://localhost:8080/teams", json = data)
    if response.status_code == 200:
        print('Team Added')
        return response.json()['id']
    elif response.status_code == 404:
        print('Body is not good')

def put_one_team(id, data):
    print(f"Replacing a team with updated data : {data}\n")
    response = requests.put(f"http://localhost:8080/teams/{id}", json = data)
    if response.status_code == 200:
        print('Team Replaced')
    elif response.status_code == 404:
        print('Body is not good')

def remove_one_team(id):
    print(f"Removing a team with id : {id}\n")
    response = requests.delete(f"http://localhost:8080/teams/{id}")
    if response.status_code == 200:
        print('Team deleted')
    elif response.status_code == 404:
        print(f"Can't find a team with the id {id}")


if __name__ == "__main__":
    get_all_teams()
    data = {"name":"TSE", "city":"SE"}
    team_posted_id = post_one_team(data)
    get_all_teams()
    data = {"name":"TélécomSaintEtienne", "city":"SE"}
    put_one_team(team_posted_id, data)
    get_all_teams()
    remove_one_team(team_posted_id)
    get_all_teams()




