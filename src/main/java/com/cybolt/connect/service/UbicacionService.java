package com.cybolt.connect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybolt.connect.dao.UbicacionDao;
import com.cybolt.connect.model.Ubicacion;

@Service
public class UbicacionService {

	
	@Autowired
	private UbicacionDao ubicacionDao;
	
	@Transactional(readOnly = true)
	public Ubicacion findById(Integer id_ubicacion) {
		System.out.println("Consultando Ubicacion con el ID " + id_ubicacion);
		Ubicacion ubicacion = (Ubicacion) ubicacionDao.findById(id_ubicacion).orElse(null);
	
		return ubicacion;
	}


	@Transactional
	public Ubicacion saveUbicacion(Ubicacion ubicacion) {
		System.out.println("Registro de Ubicacion");
		return ubicacionDao.save(ubicacion);
	}

	@Transactional
	public Ubicacion updateUbicacion(Ubicacion ubicacion) {
		System.out.println("Actualizando Ubicacion");
		return ubicacionDao.save(ubicacion);
	}


	@Transactional
	public void deleteUbicacion(Integer id_ubicacion) {
		System.out.println("Eliminando ubicacion por medio de id: " + id_ubicacion);
		ubicacionDao.deleteById(id_ubicacion);
	}
	
	@Transactional(readOnly = true)
	public List<Ubicacion> findAllUbicacion() {
		System.out.println("Consultando ubicaciones...");
		return (List<Ubicacion>) ubicacionDao.findAll();
	}

	

	
	
	
	
}
