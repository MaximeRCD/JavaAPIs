Cette branche du répertoire Java APIs constitue mon rendu pour le TD de RestAPI.

Pour le réaliser ce projet, j'ai repris le cours de Monsieur Girodon et ai developpé l'ensemble de la logique :
- findAll
- findByID
- Create
- Update
- Delete

pour les classes Teams et Players.

J'ai testé mon api via postman. Il est possible d'importer le fichier *RestAPIFoot.postman_collection.json* dans postman pour éviter de réécrire les
requêtes. Attention à bien modifier les identifiants dans les requêtes les nécessitant.

Sinon il est possible de lancer le script *client.py*
```bash
python pythonClient.py
```

Il peut être nécessaire d'installer les librairies suivantes :
```bash
pip install requests
pip install pandas
```