package com.example.crudBD1.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudBD1.entity.Citas;
import com.example.crudBD1.service.CitasService;


@RestController
@RequestMapping(path = "api/bd/citas")

public class CitasController {

  

    @Autowired
    private CitasService citasService;
    @GetMapping

    public List<Citas> getAll(){

        return citasService.getCitas();

    }

    @GetMapping("/{citasId}")

    public Optional<Citas> getById(@PathVariable("citasId") Long citasId){

        return citasService.getCitas(citasId);

    }
    

    @PostMapping

    public void saveUpdate(@RequestBody Citas citasId){

        citasService.saveOrUpdate(citasId);

    }

    @DeleteMapping("/{citasId}")

    public void saveUpdate(@PathVariable("citasId") Long citasId){

        citasService.delete(citasId);

    }
    
    

}