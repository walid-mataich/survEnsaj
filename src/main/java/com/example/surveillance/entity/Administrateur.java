package com.example.surveillance.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
public class Administrateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "le nom de profile est obligatoire")
    private String username;

    @NotBlank(message = "le nom est obligatoire")
    private String nom;

    @NotBlank(message = "le prenom de profile est obligatoire")
    private String prenom;

    @Email(message = "cet email est nom valide")
    private String email;

    @NotBlank(message = "Le mot de passe ne peut pas être vide")
    @Size(min = 8, max = 20, message = "Le mot de passe doit contenir entre 8 et 20 caractères")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Le mot de passe doit contenir au moins une majuscule, un chiffre et un caractère spécial")
    private String password;



    public Administrateur(String username, Long id, String nom, String prenom, String email, String password) {
        this.username = username;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }

    public Administrateur(){

    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}
