package com.alpha.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Referencia extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 75)
	private String nome;
	
	@Column(length = 100)
	private String email;

	@Column(length = 20)
	private String phone01;
	
	@Column(length = 20)
	private String phone02;
	
	@Column(length = 500)
	private String observacao;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="inquilino_id")
	private Inquilino inquilino;

	public Referencia() {}
	
	public Referencia(Long id, String nome, String email, String phone01, String phone02, String observacao,
			Inquilino inquilino) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.phone01 = phone01;
		this.phone02 = phone02;
		this.observacao = observacao;
		this.inquilino = inquilino;
	}

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

	public String getPhone01() {
		return phone01;
	}

	public void setPhone01(String phone01) {
		this.phone01 = phone01;
	}

	public String getPhone02() {
		return phone02;
	}

	public void setPhone02(String phone02) {
		this.phone02 = phone02;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
