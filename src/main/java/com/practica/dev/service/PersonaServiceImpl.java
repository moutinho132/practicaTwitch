package com.practica.dev.service;

import com.practica.dev.entity.PersonaEntity;
import com.practica.dev.mapper.PersonaMapper;
import com.practica.dev.model.PersonaDto;
import com.practica.dev.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
@AllArgsConstructor
public class PersonaServiceImpl implements PersonaService {
    private final PersonaMapper mapper;
    private final PersonaRepository repository;

    public PersonaDto save(PersonaDto dto){
        PersonaDto personaDtoSave = null;
        PersonaEntity entity = null;
        if(Objects.nonNull(dto)){
            personaDtoSave = mapper.entityToModel(repository.save( mapper.modelToEntity(dto)));
        }
        return personaDtoSave;
    }

}
