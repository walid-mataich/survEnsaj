package com.example.surveillance.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Choix {

    @Id
    private int idChoix;

    @NotBlank
    private int ordre;

    @ManyToOne
    @JsonBackReference("examen-choix")
    @JoinColumn(name = "idExamen")
    private Examen examen;

    @ManyToOne
    @JsonBackReference("surveillant-choix")
    @JoinColumn(name = "id")
    private Surveillant surveillant;

}
