package com.alpha.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.entity.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long>{
	
}
