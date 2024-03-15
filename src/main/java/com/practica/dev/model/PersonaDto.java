package com.practica.dev.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class PersonaDto {
    private Integer id;
    private String nombre;
    private String apellido;
    private int edad;
}
