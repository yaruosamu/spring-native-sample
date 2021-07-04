package com.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data")
public class Data {

    @Id
	private Integer id;
	private String name;
	private String description;

    public Data() {
        
    }

	public Data(Integer id, String name, String description) {
		setId(id);
		setName(name);
		setDescription(description);
    }

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}
}
