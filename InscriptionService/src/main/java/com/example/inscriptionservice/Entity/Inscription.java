package com.example.inscriptionservice.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Getter
@ToString
@Setter
@Entity
@Table(name = "inscription")
@NoArgsConstructor
@AllArgsConstructor
public class Inscription {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer  etudiant;


    private Integer cour;

}