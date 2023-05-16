Cette branche du répertoire Java APIs constitue mon rendu pour le TD de GraphQL.

Pour le réaliser j'ai récupéré le projet [GraphQL de rgirodon](https://github.com/rgirodon/tse_graphql).
J'y ai ajouté l'ensemble de la logique :
- getAll
- getByID
- Create
- Update

pour les classes Teams et Players.

J'ai testé mon api via postman. Il est possible d'importer le fichier *GraphQL API.postman_collection.json* dans postman pour éviter de réécrire les 
requêtes. Attention à bien modifier les identifiants dans les requêtes les nécessitant.

Sinon il est possible de lancer le script *client.py*
```bash
python client.py
```

Il peut être nécessaire d'installer les librairies suivantes : 
```bash
pip install requests
pip install json
```