package com.alpha.entity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.entity.model.Pessoa;

public interface PessoaReposiotry extends JpaRepository<Pessoa, Long>{
	
	Optional<Pessoa> findByEmail(String email);

}
