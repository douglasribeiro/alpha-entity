package com.alpha.entity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.alpha.entity.model.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>{
	
	Optional<Proprietario> findByCpfcnpj(String cpf);
	Optional<Proprietario> findByEmail(String email);
	
	
	@Transactional(readOnly=true)
	@Query("FROM Proprietario as i WHERE i.ativo = true")
	public List<Proprietario> findProprietariosAtivos();
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Proprietario obj")
	Page<Proprietario> findPageProprietario(PageRequest pageRequest);
	
	@Transactional(readOnly=true)
	@Query("SELECT inq from Proprietario inq WHERE inq.id = :id")
	Optional<Proprietario> buscaPorId(Long id);
	
}
