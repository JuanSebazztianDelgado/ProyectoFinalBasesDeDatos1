package com.example.crudBD1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="tbl_Pacientes")

public class Pacientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_paciente;
    private String nombre;
    private String numero_telefonico;
    private String alergias;
    private String condiciones_clinicas;
    @Column(name = "correo",unique = true, nullable = false)
    private String correo;
   
}
