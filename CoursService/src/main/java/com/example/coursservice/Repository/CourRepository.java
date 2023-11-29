package com.example.coursservice.Repository;

import com.example.coursservice.Entity.Cour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourRepository extends JpaRepository<Cour, Integer> {
}