package com.example.coursservice.Repository;

import com.example.coursservice.DTO.CourDto;
import com.example.coursservice.Entity.Cour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourRepository extends JpaRepository<Cour, Integer> {



}