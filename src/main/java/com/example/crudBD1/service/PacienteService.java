package com.example.crudBD1.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudBD1.entity.Pacientes;
import com.example.crudBD1.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public List <Pacientes> getPacientes(){
        return pacienteRepository.findAll();
    }

    public Optional <Pacientes> getPacientes(Long id){
        return pacienteRepository.findById(id);
    }

    public void saveOrUpdate(Pacientes paciente){
        pacienteRepository.save(paciente);
    }

    public void delete(Long id){
        pacienteRepository.deleteById(id);
    }



}
