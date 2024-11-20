package com.example.crudBD1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Medicos") // Nombre correcto de la tabla en la base de datos
public class Doctores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMedico; // Usamos camelCase para los atributos en Java

    private String nombre;
    private String numeroTelefonico;
    private String especialidad;
    private String horario; // Cambiado a String para almacenar rangos de tiempo o texto
}
