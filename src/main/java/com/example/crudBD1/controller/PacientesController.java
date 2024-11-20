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

import com.example.crudBD1.entity.Pacientes;
import com.example.crudBD1.service.PacienteService;

@RestController
@RequestMapping(path = "api/bd/paciente")

public class PacientesController {

  

    @Autowired
    private PacienteService pacienteService;
    @GetMapping

    public List<Pacientes> getAll(){

        return pacienteService.getPacientes();

    }

    @GetMapping("/{pacienteId}")

    public Optional<Pacientes> getById(@PathVariable("pacienteId") Long pacienteId){

        return pacienteService.getPacientes(pacienteId);

    }
    

    @PostMapping

    public void saveUpdate(@RequestBody Pacientes pacientes){

        pacienteService.saveOrUpdate(pacientes);

    }

    @DeleteMapping("/{pacienteId}")

    public void saveUpdate(@PathVariable("pacienteId") Long pacienteId){

        pacienteService.delete(pacienteId);

    }
    
    

}
