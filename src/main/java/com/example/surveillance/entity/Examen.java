package com.example.surveillance.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idExamen;

    @NotBlank(message = "la date de debut est necessaire")
    private Timestamp debut;

    @NotBlank(message = "la date de fin est necessaire")
    private Timestamp fin;


    @OneToMany(mappedBy = "idChoix")
    @JsonManagedReference("examen-choix")
    private List<Choix> lesChoix;



    @OneToMany(mappedBy = "idAffectation")
    @JsonManagedReference("examen-affectation")
    private List<Affectation> affectations;





    @ManyToOne
    @JsonBackReference("matiere-examen")
    @JoinColumn(name = "idMatiere")
    private Matiere matiere;

    @ManyToOne
    @JsonBackReference("salle-examen")
    @JoinColumn(name = "idSalle")
    private Salle salle;
}
