package com.practica.dev.mapper;

import com.practica.dev.entity.PersonaEntity;
import com.practica.dev.model.PersonaDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDto entityToModel(final PersonaEntity entity);
    PersonaEntity modelToEntity(final PersonaDto dto);
}
