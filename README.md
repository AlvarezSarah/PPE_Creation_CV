<p align="center">
<img src="https://image.flaticon.com/icons/svg/311/311334.svg" width="150">
</p>

<p align="center">
https://alvarezsarah.github.io/PPE_Creation_CV/
<img src="http://hits.dwyl.io/pawel956/pawel956/projetKarimAndCo_ConnexionInscription.svg">
<img src="https://img.shields.io/github/contributors/pawel956/projetKarimAndCo_ConnexionInscription">
<img src="https://img.shields.io/github/repo-size/pawel956/projetKarimAndCo_ConnexionInscription">
</p>

### ProjetKarimAndCo - Création d'un Curriculum Vitae comportant deux fenètres

+ La première :
	+ Inscription et 
	+ Connection
+ La deuxième :
	+ Accés l'édition et la création de son CV
	+ Utilisation d'une base de donnée afin d'enregistrer les différent cv sui un profile.
---

#### Introduction
Dans le cadre de création d'un logiciel de gestion de **curriculum vitae**, ce projet contient un composant permettant l'inscription et la connexion au logiciel.

#### Fonctionnalités
Avec ce composant, on peut :
 + S'inscrire
	 + Vérification du format des informations saisies dans les champs
	 + Vérification si la date de naissance est réelle (via un serveur de date)
 + Se connecter

--- 

#### Documentation
+ Javadoc : [ici](https://AlvarezSarah.github.io/PPE_Creation_CV/)  
+ Tuto d'utilisation : [ici]()

#### Dépendances utilisés
<img src="https://img.shields.io/badge/commons--net-3.6-success">
<img src="https://img.shields.io/badge/mysql--connector--java-5.1.48-success">

#### Informations divers

Pour se connecter à la base de données avec la classe BDD :
```java
// Initiliser la propriété dans la classe
private BDD connexionBDD = new BDD();
...
// Appel de la méthode connexionBDD
connexionBDD.ConnexionBDD();
```
