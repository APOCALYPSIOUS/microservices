package com.example.inscriptionservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.etudiantservice.Entity.Etudiant}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantDto implements Serializable {
    Integer id;
    String nom;
    String prenom;
    String number;
}