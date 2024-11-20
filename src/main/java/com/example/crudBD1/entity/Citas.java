package com.example.crudBD1.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_Pacientes")

public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_medico;
    private String nombre;
    private String numero_telefonico;
    private String especialidad;
    private Date horario;
   
}
