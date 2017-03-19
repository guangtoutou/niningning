package com.niningning.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StoreType {
	@Id
	@GeneratedValue
	private int id;

	@Column(name = "storetypename")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StoreType() {

	}

	public StoreType(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
