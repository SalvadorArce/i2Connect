package com.cybolt.connect.model.pojo;

public class LinkData extends ResponseDataBase {

	private Object fromEndId;
	private Object toEndId;
	private String linkDirection;

	public LinkData() {

	}

	public Object getFromEndId() {
		return fromEndId;
	}

	public void setFromEndId(Object fromEndId) {
		this.fromEndId = fromEndId;
	}

	public Object getToEndId() {
		return toEndId;
	}

	public void setToEndId(Object toEndId) {
		this.toEndId = toEndId;
	}

	public String getLinkDirection() {
		return linkDirection;
	}

	public void setLinkDirection(String linkDirection) {
		this.linkDirection = linkDirection;
	}

}
