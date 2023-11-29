package com.example.etudiantservice.Service;

import com.example.etudiantservice.Entity.Etudiant;
import com.example.etudiantservice.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getEtudiants(){
        return etudiantRepository.findAll();
    }

    public Etudiant AddEtud(Etudiant etud){
        return etudiantRepository.save(etud);
    }

    public void DeleteEtud(Integer id){
        etudiantRepository.deleteById(id);
    }


    public Etudiant getEtud(Integer id){
        return etudiantRepository.findById(id).get();
    }

    public boolean getEtudExist(Integer id){
        return etudiantRepository.existsById(id);
    }


}
