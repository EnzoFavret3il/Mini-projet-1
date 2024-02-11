# Ce que j'ai réalisé du projet

J'ai pu répondre à toutes les questions non bonus du sujet avec plus ou moins de difficulté.

La partie Bruit de Perlin fonctionne bien, à l'exception du cas où l'on appuie plusieurs fois sur "générer" avec une même graine. Dans ce cas, il arrive qu'une erreur OutOfBoundsException se produise, mais je n'ai pas su résoudre ce problème.

Concernant la génération de terrain, tout a été réalisé. J'ai dû modifier certaines classes en ajoutant des throws exceptions ou des blocs try and catch en raison de ma classe TerrainInnexistant (je ne comprends pas pourquoi, mais dans VisualiseurCarteTerrain, certaines parties de code étaient en erreur sans cela). Cette partie ne fonctionne pas à cause du fait que l'objet "carte" ne s'initialise pas (Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException: Cannot invoke "fr.ecole3il.rodez2023.perlin.terrain.elements.Carte.getLargeur()" because "this.this$0.carte" is null) et je ne sais pas d'où cela vient.

Le projet compile sans souci, le seul problème réside dans la génération de la carte avec le terrain lorsque l'on bouge la souris, où l'exception précédente apparaît.

## Réponse aux Questions
 
### Faites du bruit :

L'attribut "graine" est déclaré comme final pour plusieurs raisons. La première est de permettre de garantir l'intégrité des données tout au long du traitement et de produire un rendu conforme à la demande. La deuxième est d'améliorer la compréhension du code. Le mot "final" permet de comprendre que c'est l'état final de la variable.

### Diagramme UML :

Les attributs et les méthodes ne différeront pas de la classe Terrain. Cette modélisation du système n'est pas très pertinente car elle intègre plusieurs classes dont on pourrait se passer et compromet la bonne lisibilité et compréhension du code. On préférera une classe Terrain avec une énumération des différents terrains pour différencier chaque objet de la même classe.

La modélisation se trouve à la racine du projet.

### Modélisons le (type de) terrain :

**Terrain**

Nous utiliserons un type double pour ces données car cela permet d'avoir des valeurs plus précises et variées.

Nous souhaitons extraire ce morceau d'algorithme de la classe afin d'améliorer la conception du programme. Cette amélioration rendra le code plus flexible aux modifications et à l'ajout de nouveaux éléments.

## Retour sur le projet :

Ce projet était très intéressant mais aussi assez difficile. Certaines parties du sujet demandaient certaines connaissances que je n'avais pas (patron Visiteur, tableau à deux dimensions...), ce qui m'a bien ralenti dans l'avancement du sujet. Concernant l'erreur affichée sur ce que j'ai réalisé du projet, j'ai utilisé ChatGPT (je ne vais pas mentir, ça se voit) pour m'aider à corriger l'erreur, mais en vain. Je ne sais pas comment on peut avoir un "this.this.carte=null", mais je l'ai eu... C'est dommage, j'avais hâte de voir le résultat de toutes ces heures de travail.
