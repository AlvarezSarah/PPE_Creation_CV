
<img src="https://image.flaticon.com/icons/svg/311/311334.svg" width="130">

<p align="center">

<img src="http://hits.dwyl.io/alvarezsarah/alvarezsarah/PPE_Creation_CV.svg">
<img src="https://img.shields.io/github/contributors/alvarezsarah/PPE_Creation_CV">
<img src="https://img.shields.io/github/repo-size/alvarezsarah/PPE_Creation_CV">
</p>

### ProjetKarimAndCo - Création d'un Curriculum Vitae comportant deux fenètres
---
#### Principe 

Logiciel de création de **Curriculum Vitae**, ce projet contient plusieurs fonctions :
+ La première :
	+ Inscription 
	  et 
	+ Connection
+ La deuxième :
	+ Accés l'édition et la création de son CV
	+ Utilisation d'une base de donnée afin d'enregistrer les différent cv d'un profile.

---

#### Documentation

+ Javadoc : [ici](https://alvarezsarah.github.io/PPE_Creation_CV/)  
+ Tuto d'utilisation : [ici](https://docs.google.com/document/d/1on2TyfWRNnNtBA2q7An1OkUc9deOPRRCrf83_6wnQ18/edit?usp=sharing)

#### Dépendances utilisés

<p align="center">
<img src="https://img.shields.io/badge/commons--net-3.6-success">
<img src="https://img.shields.io/badge/mysql--connector--java-5.1.48-success">
<img src="https://img.shields.io/badge/itextpdf-5.5.13.1.jar-sucess">
<p>
	
### Informations divers

Pour se connecter à la base de données avec la classe BDD :
```java
// Initiliser la propriété dans la classe
private BDD connexionBDD = new BDD();
...
// Appel de la méthode connexionBDD
connexionBDD.ConnexionBDD();
```
