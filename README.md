# Activité Pratique N°2 : ORM JPA Hibernate Spring Data

## 1. Objectif

Cette activité a pour but de mettre en pratique le mapping objet-relationnel avec JPA, Hibernate et Spring Data JPA, en gérant une entité `Product` dans une base H2 en mémoire. Elle s'appuie sur la démonstration du professeur Mohamed Youssfi.

## 2. Concepts clés

Le mapping objet-relationnel (ORM) fait correspondre des classes Java à des tables relationnelles. JDBC est l'API bas niveau d'accès aux bases de données. JPA est la spécification standard de l'ORM en Java, Hibernate en est l'implémentation, et Spring Data JPA ajoute une couche qui génère automatiquement les repositories à partir d'une simple interface.

## 3. Outils et technologies

Java 17, Spring Boot, Spring Data JPA, Hibernate, H2 Database, Lombok, Maven, IntelliJ IDEA, Git/GitHub.

## 4. Architecture du projet

(Colle ici l'arborescence : entities, repository, classe principale, resources.)
![Structure](screenshots/structure.png)

## 5. Création du projet

Décris Spring Initializr et les dépendances choisies, avec une capture de l'écran de génération.
![Initializr](screenshots/initializr.png)

## 6. Entité Product

Explique chaque annotation : @Entity, @Id, @GeneratedValue, @Data, @NoArgsConstructor, @AllArgsConstructor, @Builder. Colle le code de la classe.

## 7. Configuration (application.properties)

Explique chaque propriété (url H2, console, show-sql, ddl-auto). Colle le fichier.

## 8. Repository

Explique JpaRepository, les méthodes CRUD héritées et les méthodes dérivées (findByNameContains, findByPriceGreaterThan). Colle le code.

## 9. Tests des opérations

Pour chaque opération (ajout, consultation de tous, consultation d'un produit, recherche, mise à jour, suppression), mets le morceau de code correspondant, la capture de la console et un commentaire sur le résultat.
![Ajout](screenshots/ajout.png)

## 10. Console H2

Capture de la table PRODUCT dans http://localhost:8082/h2-console.

## 11. Difficultés rencontrées

Liste les erreurs rencontrées et comment tu les as résolues.

## 12. Conclusion

Résume ce que l'activité t'a appris sur JPA, Hibernate et Spring Data.

## 13. Lancer le projet

```bash
git clone https://github.com/TON-USERNAME/jpa-hibernate-spring-data.git
cd jpa-hibernate-spring-data
./mvnw spring-boot:run
```