package com.example.etudiantservice.Repository;

import com.example.etudiantservice.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
}