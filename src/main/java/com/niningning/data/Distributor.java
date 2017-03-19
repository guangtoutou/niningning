package com.niningning.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Distributor {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "distname")
	private String name;

	@Column(name = "soldto")
	private String soldTo;

	@Column(name = "address")
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoldTo() {
		return soldTo;
	}

	public void setSoldTo(String soldTo) {
		this.soldTo = soldTo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Distributor() {

	}

	public Distributor(long id, String name, String soldTo, String address) {
		this.id = id;
		this.name = name;
		this.soldTo = soldTo;
		this.address = address;
	}

}
