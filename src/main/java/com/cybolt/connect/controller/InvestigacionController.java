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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cybolt.connect.model.Investigacion;
import com.cybolt.connect.service.InvestigacionService;

@RestController
@RequestMapping(value = "/api/investigacion", produces = { MediaType.APPLICATION_JSON_VALUE })
public class InvestigacionController {

	
	@Autowired
	private InvestigacionService investigacionService;

	@GetMapping(value = "/findAllInvestigacions")
	public ResponseEntity<Object> findAllInvestigacions() {
		return new ResponseEntity<Object>(investigacionService.findAllInvestigacion(), HttpStatus.OK);
	}

	@GetMapping(value = "/findById/{id}")
	public ResponseEntity<Object> findById(@PathVariable Integer id) {
		return new ResponseEntity<Object>(investigacionService.findById(id), HttpStatus.OK);
	}

	@PostMapping("/saveInvestigacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Investigacion crear(@RequestBody Investigacion investigacion) {
		return investigacionService.saveInvestigacion(investigacion);
	}

	@PutMapping("/updateInvestigacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Investigacion editar(@RequestBody Investigacion investigacion) {
		return investigacionService.updateInvestigacion(investigacion);
	}

	@DeleteMapping("/deleteInvestigacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		investigacionService.deleteInvestigacion(id);
	}

	

}
