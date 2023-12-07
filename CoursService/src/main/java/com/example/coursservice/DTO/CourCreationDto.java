package com.example.coursservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.coursservice.Entity.Cour}
 */

@NoArgsConstructor
@Data
public class CourCreationDto implements Serializable {
    String name;
    int duration;
}