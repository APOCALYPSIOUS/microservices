package com.example.inscriptionservice.Controller;

import com.example.inscriptionservice.DTO.CourDto;
import com.example.inscriptionservice.DTO.EtudiantDto;
import com.example.inscriptionservice.DTO.InscriptionCreationDto;
import com.example.inscriptionservice.DTO.InscriptionDto;
import com.example.inscriptionservice.Service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InscriptionsController {
    @Autowired
    private InscriptionService inscriptionService;
    @GetMapping("/getins")
    public List<InscriptionDto> getInscriptions(){
        return inscriptionService.getInscriptions();
    }

    @GetMapping("/getetudiantbyCourid/{id}")
    public List<EtudiantDto> getEtudiantById(@PathVariable Integer id){
        return inscriptionService.getEtudiantByCourId(id);
    }

    @GetMapping("/getCoursbyEtudid/{id}")
    public List<CourDto> getCoursByEtudId(@PathVariable Integer id){
        return inscriptionService.getCoursByEtudiantId(id);
    }

    @PostMapping("/addins")
    public InscriptionDto AddInscription(@RequestBody InscriptionCreationDto inscription){
        return inscriptionService.AddInscription(inscription);
    }



    @DeleteMapping("/deleteins/{id}")
    public void DeleteInscription(@PathVariable Integer id){
        inscriptionService.DeleteInscription(id);
    }


}
