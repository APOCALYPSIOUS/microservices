package com.example.coursservice.Service;

import com.example.coursservice.DTO.CourDto;
import com.example.coursservice.Entity.Cour;
import com.example.coursservice.Repository.CourRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourService {

    @Autowired
    private CourRepository courRepository;


    @Autowired
    private ModelMapper modelMapper;


    public List<CourDto> getCours(){
        return courRepository.findAll().stream().map(cour -> modelMapper.map(cour, CourDto.class)).toList();
    }

    public CourDto AddCour(CourDto cour){
        return modelMapper.map(courRepository.save(modelMapper.map(cour,Cour.class)),CourDto.class);
    }

    public void DeleteCour(Integer id){
        courRepository.deleteById(id);

    }

    public CourDto getCour(Integer id){
        return modelMapper.map(courRepository.findById(id).get(),CourDto.class);
    }

    public boolean getCourExist(Integer id){
        return courRepository.existsById(id);
    }

}
