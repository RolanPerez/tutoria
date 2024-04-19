package com.example.tutoria.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "conductores") // Cuando se levanta el proyecto se crea la tabla con el nombre "conductores"
public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conductor")
    Integer id;
    String nombre;
    String apellido;

}
