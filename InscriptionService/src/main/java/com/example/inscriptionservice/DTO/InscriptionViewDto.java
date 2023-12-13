package com.example.inscriptionservice.DTO;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.example.inscriptionservice.Entity.Inscription}
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InscriptionViewDto implements Serializable {
    Integer id;
    EtudiantDto etudiant;
    CourDto cour;
}