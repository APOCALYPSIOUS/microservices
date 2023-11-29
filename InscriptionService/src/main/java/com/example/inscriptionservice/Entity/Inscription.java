package com.example.inscriptionservice.Entity;

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
@Table(name = "inscription")
@NoArgsConstructor
@AllArgsConstructor
public class Inscription {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private Integer  idEtudiant;


    private Integer idCour;

}