package com.example.etudiantservice.Controller;

import com.example.etudiantservice.DTO.EtudiantCreationDto;
import com.example.etudiantservice.DTO.EtudiantDto;
import com.example.etudiantservice.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtudantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("/getetud")
    public List<EtudiantDto> getEtudiants(){
       return  etudiantService.getEtudiants();
    }

    @PostMapping("/addetud")
    public EtudiantDto AddEtud(@RequestBody EtudiantCreationDto etud){
        return etudiantService.AddEtud(etud);

    }

    @DeleteMapping("/deleteetud/{id}")
    public void DeleteEtud(@PathVariable Integer id){
        etudiantService.DeleteEtud(id);
    }

    @GetMapping("/getetud/{id}")
    public EtudiantDto getEtud(@PathVariable Integer id){
        return etudiantService.getEtud(id);
    }

    @GetMapping("/getetudexistance/{id}")
    public boolean getetudExist(@PathVariable Integer id){
        return etudiantService.getEtudExist(id);
    }
}
