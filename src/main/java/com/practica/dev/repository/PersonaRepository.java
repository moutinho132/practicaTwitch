package com.practica.dev.repository;

import com.practica.dev.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {

}
