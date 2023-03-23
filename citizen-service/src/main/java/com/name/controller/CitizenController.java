package com.name.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.name.model.Citizen;
import com.name.repo.CitizenRepo;

@RestController 
@RequestMapping("/citizen")
public class CitizenController {
	@Autowired
	private CitizenRepo repo;
	
	

	@GetMapping("/test")
	public ResponseEntity<String> test()
	{
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen)
	{
		Citizen citizen=repo.save(newCitizen);
		return new ResponseEntity<>(citizen,HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<List<Citizen>> getById(@PathVariable Integer id)
	{
		List<Citizen> listCitizen=repo.vaccinationCenterId(id);
		return new ResponseEntity<>(listCitizen,HttpStatus.OK);
		
	}
		
	
}
