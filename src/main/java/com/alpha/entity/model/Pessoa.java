package com.alpha.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa extends BaseEntity {
	private static final long serialVersionUID = 1L;

	
	private Long id;
	
	@Column(length = 70, nullable = false)
	private String nome;
		
	@Column(unique = true, length = 100, nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String senha;
	
	public Pessoa() {
		
	}

	public Pessoa(Long id, String nome, String email, String passwd) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = passwd;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
