package com.name.model;

import java.util.List;

import com.name.entity.VaccinationCenter;

public class RequiredResponse {
	
	
	private VaccinationCenter center;
	private List<Citizen> citizens;
	public RequiredResponse() {
		super();
	}
	public VaccinationCenter getCenter() {
		return center;
	}
	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}
	public List<Citizen> getCitizens() {
		return citizens;
	}
	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
	
	
	

	//public void setCenter(VaccinationCenter center) {
		// TODO Auto-generated method stub
		
	}


