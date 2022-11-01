package com.alpha.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.entity.model.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer>{
	
}
