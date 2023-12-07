package com.example.inscriptionservice.Service;

import com.example.inscriptionservice.DTO.CourDto;
import com.example.inscriptionservice.DTO.EtudiantDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Etudiantservice",url = "http://localhost:8081")

public interface EtudiantClient {
    @GetMapping("/getetud/{id}")
    public EtudiantDto getEtudByCourId(@PathVariable Integer id);
}
