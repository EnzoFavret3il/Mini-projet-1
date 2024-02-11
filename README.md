# Ce que j'ai réalisé du projet

J'ai pû répondre à toute les questions non bonus du sujet avec plus ou moins de difficulté.

La partie Bruit de Perlin fonctionne bien à part lorsque l'on rappuie à plusieurs reprises sur générer avec une même graine, il arrive qu'il y ait une erreur OutofBoundException mais je n'ai pas sû résoudre ce problème.

Concernant la partie de génération de terrain, tout a été réalisé, j'ai dû modifier certaines classes en ajoutant des throws exception ou try and catch à cause de ma classe TerrainInnexistant (je ne comprend pas pourquoi mais dans VisualiseurCarteTerrain j'avais certaines partie de code en erreur sans cela). Cette partie ne fonctionne pas à cause du fait que l'objet carte ne s'initialise pas (Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException: Cannot invoke "fr.ecole3il.rodez2023.perlin.terrain.elements.Carte.getLargeur()" because "this.this$0.carte" is null) et je ne sais pas d'où cela vient. 

Le projet compile sans soucis, le seul problème réside dans la génération de carte avec terrain lorsque l'on bouge la souris où l'exception précédente apparaît. 

## Réponse aux Questions

### Faites du bruit :

L'attribut graine est en final pour plusieurs raisons. La première est de permettre de garder l'intégrité de la donnée tout au long du traitement et permmettre d'avoir un rendu qui correspond à la demande. La deuxieme est pour permettre une meilleur compréhension du code. Le mot final permet de comprendre que c'est l'état final de la variable.

### Diagramme UML :

Les attributs et les méthodes ne seront pas différentes de la classe terrain. Cette modélisation du système n'est pas très pertinente car elle intègre plusieurs classes que l'on pourrait se passer et met en péril la bonne lisibilité et compréhension du code. On va préférer une classe Terrain avec une enum des différents terrains pour différencier chaque objet de la même classe. La modélisation se trouve en racine du projet.

### Modélisons le (type de) terrain

**Terrain**

On va utiliser un type double pour ces données car cela permet d'avoir des valeurs plus précises et plus variées. On souhaites sortir ce bout d'algorithme de la classe afin d'améliorer la conception du programme. Cette amélioration rendra le code plus flexible aux modifications et à l'ajout de nouveau code. 

## Retour sur le projet

Ce projet était très intéressant mais à la fois assez difficile. Certaines parties dans le sujet demandaient certaines connaissances que je n'avais pas (patron Visiteur, tableau à deux dimensions...) ce qui m'a bien ralenti sur l'avancé du sujet. Concernant l'erreur affichée sur ce que j'ai réalisé du projet, j'ai utilisé ChatGPT (je ne vais pas mentir ça se voit) pour m'aider à corriger l'erreur mais en vain. Je ne sais pas comment on peut avoir un this.this.carte=null mais je l'ai eu... C'est dommage, j'avais hâte de voir le résultat de toutes ces heures de travail.

## Commentaires

J'ai du recommencer le projet suite à quelque chose que je ne comprend toujours pas. Tout le code c'est mit à envoyer des exceptions Pointer qui ont fait que rien ne fonctionnait plus, j'ai donc trouver préférable de recommencer le projet.
Cela explique aussi les commentaires de push assez particuliers (cela m'avait fatigué sur le coup). Pardonnez moi pour cela.
