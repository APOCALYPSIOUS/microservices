package com.example.inscriptionservice.DTO;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.example.inscriptionservice.Entity.Inscription}
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InscriptionCreationDto implements Serializable {
    Integer etudiant;
    Integer cour;

}