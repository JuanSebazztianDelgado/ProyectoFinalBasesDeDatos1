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

import com.example.crudBD1.entity.Doctores;
import com.example.crudBD1.service.DoctoresService;

@RestController
@RequestMapping(path = "api/bd/doctores")

public class DoctoresController {

  

    @Autowired
    private DoctoresService doctoresService;
    @GetMapping

    public List<Doctores> getAll(){

        return doctoresService.getDoctores();

    }

    @GetMapping("/{doctoresId}")

    public Optional<Doctores> getById(@PathVariable("doctoresId") Long doctoresId){

        return doctoresService.getDoctores(doctoresId);

    }
    

    @PostMapping

    public void saveUpdate(@RequestBody Doctores doctoresId){

        doctoresService.saveOrUpdate(doctoresId);

    }

    @DeleteMapping("/{doctoresId}")
    public void deleteDoctor(@PathVariable("doctoresId") Long doctoresId) {
        doctoresService.delete(doctoresId);
    }

    
    

}