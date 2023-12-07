package com.example.inscriptionservice.Repository;

import com.example.inscriptionservice.Entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {

    List<Inscription> getAllByCour(Integer id);

    List<Inscription> getAllByEtudiant(Integer id);
}