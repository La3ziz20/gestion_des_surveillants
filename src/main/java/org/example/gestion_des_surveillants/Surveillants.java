package org.example.gestion_des_surveillants;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Surveillants implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String departement;
    private String specialite;
    private Boolean disponible;
    private Integer nbSurveillances;
    private LocalDate dateNaissance;

    public Surveillants(String nom, String prenom, String email, String telephone, String departement,
            String specialite, Boolean disponible, Integer nbSurveillances, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.departement = departement;
        this.specialite = specialite;
        this.disponible = disponible;
        this.nbSurveillances = nbSurveillances;
        this.dateNaissance = dateNaissance;
    }
}
