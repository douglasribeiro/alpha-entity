package com.alpha.entity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.entity.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	Optional<Cidade> findByNome(String nome);
	
}
