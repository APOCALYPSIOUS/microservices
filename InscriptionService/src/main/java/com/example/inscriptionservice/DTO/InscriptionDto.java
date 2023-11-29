package com.example.inscriptionservice.DTO;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.inscriptionservice.Entity.Inscription}
 */
@Value
public class InscriptionDto implements Serializable {
    Integer id;
    Integer idEtudiant;
    Integer idCour;
}