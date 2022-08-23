package com.cybolt.connect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cybolt.connect.model.entity.Persona;
import com.cybolt.connect.service.PersonaService;

@RestController
@RequestMapping(value = "/api/persona", produces = { MediaType.APPLICATION_JSON_VALUE })
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@GetMapping(value = "/findAllPersonas")
	public ResponseEntity<Object> findAllPersonas() {
		return new ResponseEntity<Object>(personaService.findAllPersona(), HttpStatus.OK);
	}

	@GetMapping(value = "/findById/{id}")
	public ResponseEntity<Object> findById(@PathVariable Integer id) {
		return new ResponseEntity<Object>(personaService.findById(id), HttpStatus.OK);
	}

	@PostMapping("/savePersona")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona crear(@RequestBody Persona persona) {
		return personaService.savePersona(persona);
	}

	@PutMapping("/updatePersona")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona editar(@RequestBody Persona persona) {
		return personaService.updatePersona(persona);
	}

	@DeleteMapping("/deletePersona/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		personaService.deletePersona(id);
	}

}
