package com.cybolt.connect.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.cybolt.connect.model.entity.Persona;
import com.cybolt.connect.model.pojo.ConnectorResponse;
import com.cybolt.connect.model.pojo.EntityData;
import com.cybolt.connect.model.pojo.LinkData;
import com.cybolt.connect.model.pojo.SocrataResponse;
import com.cybolt.connect.model.pojo.SocrataResponseData;

@Service
public class SocrataService {

	@Autowired
	PersonaService personaService;

	@Autowired
	ItemFactoryService itemFactory;

	@Value("${socrata.url}")
	String baseUrl;
	@Value("classpath:Logo.png")
	Resource resource;

	public ConnectorResponse testSocrata() {
		ConnectorResponse connectorResponse = new ConnectorResponse();

		List<Persona> listaPersona = personaService.findAllPersona();
		List<SocrataResponseData> lista = new ArrayList<SocrataResponseData>();
		SocrataResponseData data = new SocrataResponseData();

		if (listaPersona != null && !listaPersona.isEmpty()) {

			for (Persona persona : listaPersona) {
				data = new SocrataResponseData();
				data.complaintNum = "" + persona.getIdentificador();
				data.crimeStatus = persona.getNombre();
				data.jurisdictionDesc = persona.getApellidop();
				data.offenceLevel = persona.getApellidom();
				data.offenceDesc = persona.getDireccion();
				data.dateReported = LocalDate.of(2022, 8, 23);

				lista.add(data);
			}
		}

		SocrataResponse response = new SocrataResponse();
		response.add(data);

		connectorResponse = marshalItemsFromResponse(response);

		return connectorResponse;

	}

	private ConnectorResponse marshalItemsFromResponse(SocrataResponse response) {
		this.itemFactory = new ItemFactoryService(baseUrl, resource);
		final List<EntityData> entities = new ArrayList<>();
		final List<LinkData> links = new ArrayList<>();

		final Map<String, EntityData> complaints = new HashMap<>();
		final Map<String, EntityData> locations = new HashMap<>();

		response.forEach(entry -> {
			final EntityData complaint;
			if (complaints.containsKey(entry.complaintNum)) {
				complaint = complaints.get(entry.complaintNum);
			} else {
				complaint = itemFactory.createComplaint(entry);
				complaints.put(entry.complaintNum, complaint);
				entities.add(complaint);
			}

			final EntityData location;
			final String key = entry.precinctCode + entry.boroName;
			if (locations.containsKey(key)) {
				location = locations.get(key);
			} else {
				location = itemFactory.createLocation(entry);
				locations.put(key, location);
				entities.add(location);
			}

			final EntityData suspect = itemFactory.createSuspect(entry);
			final EntityData victim = itemFactory.createVictim(entry);
			entities.add(suspect);
			entities.add(victim);

			final LinkData locationLink = itemFactory.createLocationLink(entry, complaint, location);
			final LinkData suspectLink = itemFactory.createSuspectLink(entry, complaint, suspect);
			final LinkData victimLink = itemFactory.createVictimLink(entry, complaint, victim);
			links.add(locationLink);
			links.add(suspectLink);
			links.add(victimLink);
		});

		final ConnectorResponse connectorResponse = new ConnectorResponse();
		connectorResponse.setEntities(entities);
		connectorResponse.setLinks(links);
		return connectorResponse;
	}
}
