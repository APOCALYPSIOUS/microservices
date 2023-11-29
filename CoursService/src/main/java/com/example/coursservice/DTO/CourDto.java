package com.example.coursservice.DTO;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.coursservice.Entity.Cour}
 */
@Value
public class CourDto implements Serializable {
    String name;
    int duration;
}