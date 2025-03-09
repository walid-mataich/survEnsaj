package com.example.surveillance.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Affectation {
    @Id
    private int idAffectation;

    @ManyToOne
    @JsonBackReference("examen-affectation")
    @JoinColumn(name = "idExamen")
    private Examen examen;

    @ManyToOne
    @JsonBackReference("surveillant-affectation")
    @JoinColumn(name = "id")
    private Surveillant surveillant;
}
