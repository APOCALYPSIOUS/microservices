package com.example.inscriptionservice.Controller;

import com.example.inscriptionservice.DTO.*;
import com.example.inscriptionservice.Service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InscriptionsController {
    @Autowired
    private InscriptionService inscriptionService;
    @GetMapping("inscription/getins")
    public List<InscriptionViewDto> getInscriptions(){
        return inscriptionService.getInscriptions();
    }

    @GetMapping("inscription/getetudiantbyCourid/{id}")
    public List<EtudiantDto> getEtudiantById(@PathVariable Integer id){
        return inscriptionService.getEtudiantByCourId(id);
    }

    @GetMapping("/getCoursbyEtudid/{id}")
    public List<CourDto> getCoursByEtudId(@PathVariable Integer id){
        return inscriptionService.getCoursByEtudiantId(id);
    }

    @PostMapping("inscription/addins")
    public InscriptionDto AddInscription(@RequestBody InscriptionCreationDto inscription){
        return inscriptionService.AddInscription(inscription);
    }



    @DeleteMapping("inscription/deleteins/{id}")
    public void DeleteInscription(@PathVariable Integer id){
        inscriptionService.DeleteInscription(id);
    }


}
