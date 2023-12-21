package com.example.inscriptionservice.Service;

import com.example.inscriptionservice.DTO.*;
import com.example.inscriptionservice.Entity.Inscription;
import com.example.inscriptionservice.Repository.InscriptionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Autowired
    private RestTemplate restTemplate ;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private WebClient webClient;

    @Autowired
    private CourClient courClient;

    @Autowired
    private EtudiantClient etudiantClient;

    String coursUrl = "http://localhost:8080/cour/getcourexistance/";

    String etudUrl = "http://localhost:8081/etudiant/getetudexistance/";

    public List<InscriptionViewDto> getInscriptions(){
        List<InscriptionViewDto> inscriptionDto1s = new ArrayList<>();
        List<InscriptionDto> inscriptions = inscriptionRepository.findAll().stream().map(inscription -> modelMapper.map(inscription,InscriptionDto.class)).toList();
        for(InscriptionDto inscription : inscriptions) {
            Integer idCour = inscription.getCour();
            Integer idEtudiant = inscription.getEtudiant();
            InscriptionViewDto inscriptionViewDto = new InscriptionViewDto();
            inscriptionViewDto.setId(inscription.getId());
            EtudiantDto etudiantDto = etudiantClient.getEtudById(idEtudiant);
            CourDto courDto = courClient.getCourById(idCour);
            inscriptionViewDto.setEtudiant(etudiantDto);
            inscriptionViewDto.setCour(courDto);
            inscriptionDto1s.add(inscriptionViewDto);
        }
        return inscriptionDto1s;

    }

    public InscriptionDto AddInscription(InscriptionCreationDto inscription) {
//        ResponseEntity<Boolean> responseCourEntity = restTemplate.getForEntity(coursUrl + "/" + inscription.getIdCour(), Boolean.class);
//        ResponseEntity<Boolean> responseEtudiantEntity = restTemplate.getForEntity(etudUrl + "/" + inscription.getIdEtudiant(), Boolean.class);
//
//        boolean response = responseCourEntity.getBody() && responseEtudiantEntity.getBody();
//
//        if (response) {
//            return modelMapper.map(inscriptionRepository.save(inscription), InscriptionDto.class);
//
//        } else {
//            System.out.println("Cours ou etudiant inexistant");
//            return null;
//
//        }
        Boolean courResponse = webClient.get().uri(coursUrl + inscription.getCour()).retrieve().bodyToMono(boolean.class).block();
        Boolean etudiantResponse = webClient.get().uri(etudUrl + inscription.getEtudiant()).retrieve().bodyToMono(boolean.class).block();


        boolean response = courResponse.booleanValue() && etudiantResponse.booleanValue();
        if (response) {
            return modelMapper.map(inscriptionRepository.save(modelMapper.map(inscription,Inscription.class)), InscriptionDto.class);


        } else {
            System.out.println("Cours ou etudiant inexistant");
            return null;

        }


    }




    public void DeleteInscription(Integer id){
        inscriptionRepository.deleteById(id);
    }


    public List<EtudiantDto> getEtudiantByCourId(Integer id) {


        List<Integer> etudiantId = inscriptionRepository.getAllByCour(id).stream().map(Inscription::getEtudiant).toList();

        List<EtudiantDto> etudiants = new ArrayList<>();

        for (Integer i : etudiantId) {
//
//          EtudiantDto etudiant = webClient.get().uri("http://localhost:8081/getetud/" + i).retrieve().bodyToMono(EtudiantDto.class).block();
            EtudiantDto etudiant= etudiantClient.getEtudById(i);
            etudiants.add(etudiant);
        }
        return etudiants;
    }

    public List<CourDto> getCoursByEtudiantId(Integer id) {
        List<Integer> courId = inscriptionRepository.getAllByEtudiant(id).stream().map(Inscription::getCour).toList();
        List<CourDto> cours = new ArrayList<>();
        for (Integer i : courId) {
//            CourDto cour = webClient.get().uri("http://localhost:8080/getcour/" + i).retrieve().bodyToMono(CourDto.class).block();
            CourDto cour = courClient.getCourById(i);
            cours.add(cour);
        }
        return cours;
    }
}
