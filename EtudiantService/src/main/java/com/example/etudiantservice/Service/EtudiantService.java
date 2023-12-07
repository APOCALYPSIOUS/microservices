package com.example.etudiantservice.Service;

import com.example.etudiantservice.DTO.EtudiantCreationDto;
import com.example.etudiantservice.DTO.EtudiantDto;
import com.example.etudiantservice.Entity.Etudiant;
import com.example.etudiantservice.Repository.EtudiantRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<EtudiantDto> getEtudiants(){
        return etudiantRepository.findAll().stream().map(etud -> new EtudiantDto(etud.getId(),etud.getNom(),etud.getPrenom(),etud.getNumber())).toList();
    }

    public EtudiantDto AddEtud(EtudiantCreationDto etud){
        return modelMapper.map(etudiantRepository.save(modelMapper.map(etud,Etudiant.class)), EtudiantDto.class);
    }

    public void DeleteEtud(Integer id){
        etudiantRepository.deleteById(id);
    }


    public EtudiantDto getEtud(Integer id){
        return modelMapper.map(etudiantRepository.findById(id).get(),EtudiantDto.class);//etudiantRepository.findById(id).get();
    }

    public boolean getEtudExist(Integer id){
        return etudiantRepository.existsById(id);
    }


}
