package com.example.inscriptionservice.Controller;

import com.example.inscriptionservice.Entity.Inscription;
import com.example.inscriptionservice.Repository.InscriptionRepository;
import com.example.inscriptionservice.Service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class InscriptionsController {
    @Autowired
    private InscriptionService inscriptionService;
    @GetMapping("/getins")
    public List<Inscription> getInscriptions(){
        return inscriptionService.getInscriptions();
    }

    @PostMapping("/addins")
    public Inscription AddInscription(@RequestBody Inscription inscription){
        return inscriptionService.AddInscription(inscription);
    }

    @DeleteMapping("/deleteins/{id}")
    public void DeleteInscription(@PathVariable Integer id){
        inscriptionService.DeleteInscription(id);
    }


}
