package com.example.crudBD1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudBD1.entity.Doctores;
import com.example.crudBD1.repository.DoctoresRepository;

@Service
public class DoctoresService {

    @Autowired
    DoctoresRepository doctoresRepository; // Cambiado el nombre para consistencia

    public List<Doctores> getDoctores() {
        return doctoresRepository.findAll();
    }

    public Optional<Doctores> getDoctores(Long id) {
        return doctoresRepository.findById(id);
    }

    public void saveOrUpdate(Doctores doctor) {
        doctoresRepository.save(doctor);
    }

    public void delete(Long id) {
    doctoresRepository.deleteById(id);
        }

}
