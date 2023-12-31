package com.example.inscriptionservice.DTO;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.example.inscriptionservice.Entity.Inscription}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InscriptionDto implements Serializable {
    Integer id;
    Integer etudiant;
    Integer cour;
}