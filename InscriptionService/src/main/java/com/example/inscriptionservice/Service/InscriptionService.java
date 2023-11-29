package com.example.inscriptionservice.Service;

import com.example.inscriptionservice.Entity.Inscription;
import com.example.inscriptionservice.Repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    RestTemplate restTemplate = new RestTemplate();

    String coursUrl = "http://localhost:8080/getcourexistance";

    String etudUrl = "http://localhost:8081/getetudexistance";

    public List<Inscription> getInscriptions(){
        return inscriptionRepository.findAll();
    }

    public Inscription AddInscription(Inscription inscription) {
        ResponseEntity<Boolean> responseCourEntity = restTemplate.getForEntity(coursUrl + "/" + inscription.getIdCour(), Boolean.class);
        ResponseEntity<Boolean> responseEtudiantEntity = restTemplate.getForEntity(etudUrl + "/" + inscription.getIdEtudiant(), Boolean.class);

        boolean response = responseCourEntity.getBody() && responseEtudiantEntity.getBody();

        if (response) {
            inscriptionRepository.save(inscription);
            return inscription;
        } else {
            System.out.println("Cours ou etudiant inexistant");
        }
        return inscription;
    }


    public void DeleteInscription(Integer id){
        inscriptionRepository.deleteById(id);
    }







}
