# Ce que j'ai réalisé du projet

J'ai pû répondre à toute les questions non bonus du sujet avec plus ou moins de difficulté. La classe super bruit perlin a été faite aussi. 

### BruitDePerlin
La partie Bruit de Perlin (image rouge à forme aléatoire à générer) fonctionne bien à part lorsque l'on rappuie à plusieurs reprises sur générer avec une même graine, il arrive qu'il y ait une erreur OutofBoundException mais je n'ai pas sû résoudre ce problème.

### Carte
Concernant la partie de génération de terrain, tout a été réalisé, j'ai dû modifier certaines classes (VisualiseurTerrain et autre) en ajoutant des throws exception ou try and catch à cause de ma classe TerrainInnexistant (je ne comprend pas pourquoi mais dans VisualiseurCarteTerrain j'avais certaines partie de code en erreur sans cela). La génération de carte via les deux générateurs fonctionne.. 
Le clique sur les tuils fonctionnes mais un problème de résolution fait que certain biomes n'ont pas les bonnes valeurs. Je n'ai pas sû le résoudre. Aussi l'importation d'une carte ne fonctionne pas non plus mais la sauvegarde elle fonctionne.

### Tests Unitaires
Au sujet des Tests Unitaires, deux classes tests générateuraléatoire ainsi que typeterrains.


Le projet compile sans soucis. 

## Réponse aux Questions

### Faites du bruit :

L'attribut graine est en final pour plusieurs raisons. La première est de permettre de garder l'intégrité de la donnée tout au long du traitement et permmettre d'avoir un rendu qui correspond à la demande. La deuxieme est pour permettre une meilleur compréhension du code. Le mot final permet de comprendre que c'est l'état final de la variable.

### Diagramme UML :

Les attributs et les méthodes ne seront pas différentes de la classe terrain. Cette modélisation du système n'est pas très pertinente car elle intègre plusieurs classes que l'on pourrait se passer et met en péril la bonne lisibilité et compréhension du code. On va préférer une classe Terrain avec une enum des différents terrains pour différencier chaque objet de la même classe. La modélisation se trouve en racine du projet.

### Modélisons le (type de) terrain

**Terrain**

On va utiliser un type double pour ces données car cela permet d'avoir des valeurs plus précises et plus variées. 
On souhaites sortir ce bout d'algorithme de la classe afin d'améliorer la conception du programme. Cette amélioration rendra le code plus flexible aux modifications et à l'ajout de nouveau code. 

## Retour sur le projet

Ce projet était très intéressant mais à la fois assez difficile. Certaines parties dans le sujet demandaient certaines connaissances que je n'avais pas (patron Visiteur, tableau à deux dimensions...) ce qui m'a bien ralenti sur l'avancé du sujet. ChatGpt a été utilisé pour corriger des erreurs (je ne vais pas le cacher, cela se voit).

## Commentaires

J'ai du recommencer le projet suite à quelque chose que je ne comprend toujours pas. Tout le code s'est mit à envoyer des exceptions Pointer qui ont fait que rien ne fonctionnait plus, j'ai donc trouver préférable de recommencer le projet.
Cela explique aussi les commentaires de push assez particuliers (cela m'avait fatigué sur le coup). Pardonnez moi pour cela.
