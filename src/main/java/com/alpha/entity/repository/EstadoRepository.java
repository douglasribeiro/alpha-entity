package com.alpha.entity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.entity.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	Optional<Estado> findByNome(String nome);
}
