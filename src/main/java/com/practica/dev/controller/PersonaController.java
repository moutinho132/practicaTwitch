package com.practica.dev.controller;

import com.practica.dev.model.PersonaDto;
import com.practica.dev.service.PersonaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = ("/api/persona"))
public class PersonaController implements PersonaApi {
    private final PersonaServiceImpl service;

    @Override
    public PersonaDto save(PersonaDto request) {
        return service.save(request);
    }
}
