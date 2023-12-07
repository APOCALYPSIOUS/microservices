package com.example.coursservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.coursservice.Entity.Cour}
 */
@Data
@NoArgsConstructor
public class CourDto implements Serializable {
    int id ;
    String name;
    int duration;

}