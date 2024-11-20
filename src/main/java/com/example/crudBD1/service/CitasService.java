package com.example.crudBD1.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudBD1.entity.Citas;
import com.example.crudBD1.repository.CitasRepository;

@Service
public class CitasService {

    @Autowired
    CitasRepository citasRepository;

    public List <Citas> getCitas(){
        return citasRepository.findAll();
    }

    public Optional <Citas> getCitas(Long id){
        return citasRepository.findById(id);
    }

    public void saveOrUpdate(Citas paciente){
        citasRepository.save(paciente);
    }

    public void delete(Long id){
        citasRepository.deleteById(id);
    }



}
