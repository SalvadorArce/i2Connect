package com.cybolt.connect.dao;

import org.springframework.data.repository.CrudRepository;

import com.cybolt.connect.model.entity.Persona;

public interface PersonaDao extends CrudRepository<Persona, Integer> {

}
