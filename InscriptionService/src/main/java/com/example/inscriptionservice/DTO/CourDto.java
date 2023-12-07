package com.example.inscriptionservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.coursservice.Entity.Cour}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourDto implements Serializable {
    int id;
    String name;
    int duration;
}