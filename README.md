H2:
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports 
embedded and server modes as well as a browser based console application.

Thymeleaf:
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly 
displayed in browsers and as static prototypes.

JPA:
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

Hibernate:
Hibernate est un framework open source gérant la persistance des objets en base de données relationnelle.
Hibernate apporte une solution aux problèmes d'adaptation entre le paradigme objet et les SGBD en remplaçant les accès à la base de données par des appels à des méthodes objet de haut niveau.


DevTools:
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

Web:
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

Étape 13:
    1. avec @GetMapping("/greeting")
    2. return "greeting";
    3. via HTTP GET, on le récupère avec nameGet dans le controller

Étape 17:
Une nouvelle table ADDRESS a été créée

Étape 18:
*** Voir doc Hibernate ***

Étape 20:
On voit tout le contenu de la table Address avec SELECT * FROM Address

Étape 23:
Permet d'éliminer le besoin des getters et setters

Étape 30:
Ajout de bootstrap par CDN: pas besoin d'installer quoi que ce soit
On l'importe directement dans le layout avec 3 balises

J'ai essayé aussi mais pas réussi à les importer dans les vues avec une dépendance :
Ajout de la dépendance Webjars dans pom.xml :
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>bootstrap</artifactId>
        <version>4.5.3</version>
    </dependency>
Bootstrap ajoute également jQuery ans popper.js


On aurait pu également importer les fichiers bootstrap directement dans le dossier 'static'

Pour mettre en place le layout je me suis beaucoup aidé de la doc, j'ai repris les même schéma:
https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html

TP Partie 2 :
- Il faut une clé API pour appeler OpenWeatherMap
- - https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key} pour la météo actuelle
  - https://api.openweathermap.org/data/2.5/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key} pour la météo actuelle et plusieurs prévision par minutes, heures, jours
- On utilise des méthodes HTTP GET
- On passe les paramètres d'appels dans l'URL
- - Dans l'API on récupère la valeur current > temp pour afficher la température
  - Dans l'API on récupère la valeur minutely|hourly|daily > weather > description pour afficher la description de la prévision météo


