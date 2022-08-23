package com.cybolt.connect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybolt.connect.dao.InvestigacionDao;
import com.cybolt.connect.model.entity.Investigacion;

@Service
public class InvestigacionService {

	@Autowired
	private InvestigacionDao investigacionDao;

	@Transactional(readOnly = true)
	public Investigacion findById(Integer id_investigacion) {
		System.out.println("Consultando Investigacion con el ID " + id_investigacion);
		Investigacion investigacion = (Investigacion) investigacionDao.findById(id_investigacion).orElse(null);

		return investigacion;
	}

	@Transactional
	public Investigacion saveInvestigacion(Investigacion investigacion) {
		System.out.println("Registro de Investigacion");
		return investigacionDao.save(investigacion);
	}

	@Transactional
	public Investigacion updateInvestigacion(Investigacion investigacion) {
		System.out.println("Actualizando Investigacion");
		return investigacionDao.save(investigacion);
	}

	@Transactional
	public void deleteInvestigacion(Integer id_investigacion) {
		System.out.println("Eliminando investigacion por medio de id: " + id_investigacion);
		investigacionDao.deleteById(id_investigacion);
	}

	@Transactional(readOnly = true)
	public List<Investigacion> findAllInvestigacion() {
		System.out.println("Consultando investigaciones...");
		return (List<Investigacion>) investigacionDao.findAll();
	}

}
