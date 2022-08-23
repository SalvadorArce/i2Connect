package com.cybolt.connect.model.pojo;

import java.util.Map;

public class ResponseDataBase {

	private Object id;
	private String typeId;
	private Long version;
	private Map<String, Object> properties;
	private SourceReference sourceReference;

	public ResponseDataBase() {

	}

	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	public SourceReference getSourceReference() {
		return sourceReference;
	}

	public void setSourceReference(SourceReference sourceReference) {
		this.sourceReference = sourceReference;
	}

}
