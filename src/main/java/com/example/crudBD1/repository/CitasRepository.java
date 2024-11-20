package com.example.crudBD1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudBD1.entity.Citas;

@Repository

public interface CitasRepository extends JpaRepository<Citas,Long> {

} 
