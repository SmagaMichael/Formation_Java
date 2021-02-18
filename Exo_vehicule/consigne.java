package Exo_vehicule;

//Exer­cice 1
//Un parc auto se compose des voitures et des ca­mions qui ont des caractéristiques
//communes regroupées dans la classe Véhicule.

//Chaque véhicule est caractérisé par son matricule, l’année de son modèle, son
//prix.

//Lors de la création d’un véhicule, son matricule est incrémenté selon le nombre
//de véhicules créés.

// les attributs de la classe véhicule sont supposés privés. ce qui oblige la
//création des ac­ces­seurs (get…) et des mutateurs (set….) ou les propriétés.

//La classe VéIcule possède également deux méthodes abstraites démarrer() et
//accélérer() qui seront définies dans les classes dérivées et qui afficheront des messages personnalisés.

//La méthode ToString() de la classe Véhicule retourne une chaîne de caractères
//qui contient les va­leurs du matricule, de l’année du modèle et du prix.

//Les classes Voiture et Camion étendent la classe Véhicule en définissant
//concrètement les mé­thodes accélérer() et démarrer() en affichant des mes­sages
//personnalisés.

//Travail à faire :
//- Créer la classe abs­traite Véhicule.
//- Créer les classes Ca­mion et Voiture.
//- Créer une classe Test qui permet de tes­ter la classe Voiture et la classe Camion