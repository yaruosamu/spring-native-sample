package com.sample.model;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="data")
public class Data {

    @Id
	private Integer id;
	private String name;
	private String description;
}
