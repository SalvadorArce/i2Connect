package com.cybolt.connect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybolt.connect.dao.PersonaDao;
import com.cybolt.connect.model.entity.Persona;

@Service
public class PersonaService {

	@Autowired
	private PersonaDao personaDao;

	@Transactional(readOnly = true)
	public Persona findById(Integer identificador) {
		System.out.println("Consultando Persona con el ID " + identificador);
		Persona persona = (Persona) personaDao.findById(identificador).orElse(null);

		return persona;
	}

	@Transactional
	public Persona savePersona(Persona persona) {
		System.out.println("Registro de Persona");
		return personaDao.save(persona);
	}

	@Transactional
	public Persona updatePersona(Persona persona) {
		System.out.println("Actualizando Persona");
		return personaDao.save(persona);
	}

	@Transactional
	public void deletePersona(Integer identificador) {
		System.out.println("Eliminando persona por medio de id: " + identificador);
		personaDao.deleteById(identificador);
	}

	@Transactional(readOnly = true)
	public List<Persona> findAllPersona() {
		System.out.println("Consultando personas...");
		return (List<Persona>) personaDao.findAll();
	}

}
