package com.alpha.entity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.alpha.entity.model.Inquilino;

public interface InquilinoRepository extends JpaRepository<Inquilino, Long>{
	
	Optional<Inquilino> findByCpfcnpj(String cpf);
	Optional<Inquilino> findByEmail(String email);
	
	
	@Transactional(readOnly=true)
	@Query("FROM Inquilino as i WHERE i.ativo = true")
	public List<Inquilino> findInquilinosAtivos();
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Inquilino obj")
	Page<Inquilino> findPageInquilino(PageRequest pageRequest);
	
	@Transactional(readOnly=true)
	@Query("SELECT inq from Inquilino inq WHERE inq.id = :id")
	Optional<Inquilino> buscaPorId(Long id);

}
