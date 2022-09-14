package com.alpha.entity.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.alpha.entity.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	Optional<Cidade> findByNome(String nome);
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Cidade obj WHERE obj.estado = (SELECT est.id from Estado est WHERE (est.sigla = :estado OR est.id = :estado))")
	public List<Cidade> findCidadesPorEstados(@Param("estado") String estado);
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Cidade obj WHERE obj.nome like %:nome% ORDER BY obj.nome")
	public List<Cidade> findCidades(@Param("nome") String nome);
	
	@Transactional(readOnly=true)
	@Query("SELECT c FROM Cidade c WHERE c.nome = :cidade and c.estado = (SELECT est.id from Estado est WHERE (est.sigla = :estado OR est.id = :estado))")
	Optional<Cidade> findNomeAndUf(@Param("cidade") String cidade, @Param("estado") String estado);
}
//select cid.id, cid.nome, est.sigla from cidade cid inner join Estado est
//where cid.estado = est.id and est.id = 26