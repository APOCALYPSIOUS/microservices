package com.example.coursservice.Service;

import com.example.coursservice.Entity.Cour;
import com.example.coursservice.Repository.CourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourService {

    @Autowired
    private CourRepository courRepository;


    public List<Cour> getCours(){
        return courRepository.findAll();
    }

    public Cour AddCour(Cour cour){
        courRepository.save(cour);
        return cour;
    }

    public void DeleteCour(Integer id){
        courRepository.deleteById(id);

    }

    public Cour getCour(Integer id){
        return courRepository.findById(id).get();
    }

    public boolean getCourExist(Integer id){
        return courRepository.existsById(id);
    }

}
