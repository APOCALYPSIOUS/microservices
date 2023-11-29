package com.example.inscriptionservice.Repository;

import com.example.inscriptionservice.Entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {


}