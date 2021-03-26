package com.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Ability;

@Repository
public interface AbilityRepository extends JpaRepository<Ability, Entity>{
	
}
