package com.example.surveillance.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Matiere {

    @Id
    private int idMatiere;
    private String nomMatiere;

    // Relation ManyToOne : Chaque matière a un seul chef de module
    @ManyToOne
    @JoinColumn(name = "id")  // La clé étrangère dans la table Matiere
    private Surveillant chefDeModule;  // Le chef de module responsable de la matière


    @OneToMany(mappedBy = "idExamen")
    private List<Examen> examens;
}
