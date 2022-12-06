package com.alpha.entity.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.alpha.entity.model.Endereco;
import com.alpha.entity.model.enums.EstCivil;
import com.alpha.entity.model.enums.Tipo;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InquilinoNewDto {
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=100, message="O tamanho deve ser entre 5 e 100 caracteres")
	private String nome;
	
	private Tipo pessoa;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String cpfcnpj;
	
	private String identinscr;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido")
	private String email;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtNiver;
	
	private EstCivil estCivil;
	
	private String sexo;
	
	private Boolean ativo;
	
	private String naturalidade;
	
	private String nacional;
	
	private List<String> telefones = new ArrayList<>();
	
	private List<Endereco> enderecos = new ArrayList<>();

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getPessoa() {
		return pessoa;
	}

	public void setPessoa(Tipo pessoa) {
		this.pessoa = pessoa;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getIdentinscr() {
		return identinscr;
	}

	public void setIdentinscr(String identinscr) {
		this.identinscr = identinscr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNiver() {
		return dtNiver;
	}

	public void setDtNiver(Date dtNiver) {
		this.dtNiver = dtNiver;
	}

	public EstCivil getEstCivil() {
		return estCivil;
	}

	public void setEstCivil(EstCivil estCivil) {
		this.estCivil = estCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNacional() {
		return nacional;
	}

	public void setNacional(String nacional) {
		this.nacional = nacional;
	}

}
