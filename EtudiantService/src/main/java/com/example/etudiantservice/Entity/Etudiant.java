package com.example.etudiantservice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "new_entity")
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;


    private String nom;

    private String prenom;

    private String number;



}