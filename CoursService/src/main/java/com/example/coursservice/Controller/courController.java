package com.example.coursservice.Controller;

import com.example.coursservice.DTO.CourDto;
import com.example.coursservice.Entity.Cour;
import com.example.coursservice.Service.CourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class courController {
    @Autowired
    private CourService courService;

    @GetMapping("cour/getcour")
    public List<CourDto> getCours(){
        return courService.getCours();
    }

    @PostMapping("cour/addcour")
    public CourDto AddCour(@RequestBody CourDto cour){
        return courService.AddCour(cour);
    }

    @DeleteMapping("cour/deletecour/{id}")
    public void DeleteCour(@PathVariable Integer id){
        courService.DeleteCour(id);
    }

    @GetMapping("cour/getcour/{id}")
    public CourDto getCour(@PathVariable Integer id){
        return courService.getCour(id);
    }

    @GetMapping("cour/getcourexistance/{id}")
    public boolean getCourExist(@PathVariable Integer id){
        return courService.getCourExist(id);
    }
}
