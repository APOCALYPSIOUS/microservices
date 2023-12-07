package com.example.inscriptionservice.Service;

import com.example.inscriptionservice.DTO.CourDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Courservice",url = "http://localhost:8080")
public interface CourClient {
    @GetMapping("/getcour/{id}")
    CourDto getCourById(@PathVariable Integer id);

}
