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

import com.cybolt.connect.model.entity.Ubicacion;
import com.cybolt.connect.service.UbicacionService;

@RestController
@RequestMapping(value = "/api/ubicacion", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UbicacionController {

	@Autowired
	private UbicacionService ubicacionService;

	@GetMapping(value = "/findAllUbicacions")
	public ResponseEntity<Object> findAllUbicacions() {
		return new ResponseEntity<Object>(ubicacionService.findAllUbicacion(), HttpStatus.OK);
	}

	@GetMapping(value = "/findById/{id}")
	public ResponseEntity<Object> findById(@PathVariable Integer id) {
		return new ResponseEntity<Object>(ubicacionService.findById(id), HttpStatus.OK);
	}

	@PostMapping("/saveUbicacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Ubicacion crear(@RequestBody Ubicacion ubicacion) {
		return ubicacionService.saveUbicacion(ubicacion);
	}

	@PutMapping("/updateUbicacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Ubicacion editar(@RequestBody Ubicacion ubicacion) {
		return ubicacionService.updateUbicacion(ubicacion);
	}

	@DeleteMapping("/deleteUbicacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		ubicacionService.deleteUbicacion(id);
	}

}
