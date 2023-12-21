package com.example.inscriptionservice.Service;

import com.example.inscriptionservice.DTO.CourDto;
import com.example.inscriptionservice.DTO.EtudiantDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "EtudiantService")

public interface EtudiantClient {
    @GetMapping("etudiant/getetud/{id}")
    EtudiantDto getEtudById(@PathVariable Integer id);
}
