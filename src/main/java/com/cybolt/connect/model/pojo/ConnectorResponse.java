package com.cybolt.connect.model.pojo;

import java.util.List;

public class ConnectorResponse {

	private List<EntityData> entities;
	private List<LinkData> links;

	public ConnectorResponse() {
		super();
	}

	public List<EntityData> getEntities() {
		return entities;
	}

	public void setEntities(List<EntityData> entities) {
		this.entities = entities;
	}

	public List<LinkData> getLinks() {
		return links;
	}

	public void setLinks(List<LinkData> links) {
		this.links = links;
	}

}
