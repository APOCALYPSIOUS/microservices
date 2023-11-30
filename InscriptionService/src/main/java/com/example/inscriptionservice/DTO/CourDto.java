package com.example.inscriptionservice.DTO;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.coursservice.Entity.Cour}
 */
@Value
public class CourDto implements Serializable {
    int id;
    String name;
    int duration;
}