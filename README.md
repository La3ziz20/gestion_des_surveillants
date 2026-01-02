# Gestion des Surveillants

Une application Spring Boot pour la gestion des surveillants d'examens.

## Fonctionnalités

- Gestion des informations des surveillants (Nom, Prénom, Email, Téléphone, Département, Spécialité, etc.).
- Suivi de la disponibilité et du nombre de surveillances.
- API REST pour les opérations CRUD (via Spring Data REST).

## Technologies utilisées

- **Java 17+**
- **Spring Boot** (Web, Data JPA, Validation)
- **Base de données H2** (pour le développement/test)
- **Lombok**

## Prérequis

- JDK 17 ou supérieur
- Maven (ou utiliser le wrapper `mvnw` inclus)

## Comment lancer le projet

1.  Cloner le dépôt :
    ```bash
    git clone https://github.com/La3ziz20/gestion_des_surveillants.git
    cd gestion_des_surveillants
    ```

2.  Lancer l'application avec Maven Wrapper :
    ```bash
    ./mvnw spring-boot:run
    ```

3.  Accéder à l'application (API) :
    - L'application démarre par défaut sur `http://localhost:8096`.
    - Des données de test sont chargées au démarrage.

## Structure du projet

- `src/main/java/.../Surveillants.java` : Entité JPA représentant un surveillant.
- `src/main/java/.../SurveillantsRepo.java` : Repository Spring Data REST.
- `src/main/java/.../GestionDesSurveillantsApplication.java` : Classe principale et chargement des données initiales.
