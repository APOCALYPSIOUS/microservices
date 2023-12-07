package com.example.etudiantservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.etudiantservice.Entity.Etudiant}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class EtudiantCreationDto implements Serializable {
    String nom;
    String prenom;
    String number;

}