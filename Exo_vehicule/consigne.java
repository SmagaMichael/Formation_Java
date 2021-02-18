package Exo_vehicule;

//Exer�cice 1
//Un parc auto se compose des voitures et des ca�mions qui ont des caract�ristiques
//communes regroup�es dans la classe V�hicule.

//Chaque v�hicule est caract�ris� par son matricule, l�ann�e de son mod�le, son
//prix.

//Lors de la cr�ation d�un v�hicule, son matricule est incr�ment� selon le nombre
//de v�hicules cr��s.

// les attributs de la classe v�hicule sont suppos�s priv�s. ce qui oblige la
//cr�ation des ac�ces�seurs (get�) et des mutateurs (set�.) ou les propri�t�s.

//La classe V�Icule poss�de �galement deux m�thodes abstraites d�marrer() et
//acc�l�rer() qui seront d�finies dans les classes d�riv�es et qui afficheront des messages personnalis�s.

//La m�thode ToString() de la classe V�hicule retourne une cha�ne de caract�res
//qui contient les va�leurs du matricule, de l�ann�e du mod�le et du prix.

//Les classes Voiture et Camion �tendent la classe V�hicule en d�finissant
//concr�tement les m�thodes acc�l�rer() et d�marrer() en affichant des mes�sages
//personnalis�s.

//Travail � faire :
//- Cr�er la classe abs�traite V�hicule.
//- Cr�er les classes Ca�mion et Voiture.
//- Cr�er une classe Test qui permet de tes�ter la classe Voiture et la classe Camion