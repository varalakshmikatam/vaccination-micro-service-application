package com.name.repo;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.name.model.Citizen;
@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	List<Citizen> vaccinationCenterId(Integer id);

}
