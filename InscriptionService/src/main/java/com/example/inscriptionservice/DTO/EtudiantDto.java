package com.example.inscriptionservice.DTO;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.etudiantservice.Entity.Etudiant}
 */
@Value
public class EtudiantDto implements Serializable {
    Integer id;
    String nom;
    String prenom;
    String number;
}