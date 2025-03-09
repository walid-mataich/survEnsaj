package com.example.surveillance.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Salle {

    @Id
    private int idSalle;

    @NotBlank(message = "le nom de la salle est necesaire")
    private String nomSale;


    @OneToMany(mappedBy = "idExamen")
    @JsonManagedReference("salle-examen")
    private List<Examen> examens;



    public Salle(int idSalle, String nomSale) {
        this.idSalle = idSalle;
        this.nomSale = nomSale;
    }

    public Salle() {
    }

}
