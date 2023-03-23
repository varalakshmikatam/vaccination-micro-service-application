package com.name.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citizentable")
public class Citizen {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer vaccinationCenterId;
	public Citizen() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVaccinationCenterId() {
		return vaccinationCenterId;
	}
	public void setVaccinationCenterId(Integer vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}
		
}
