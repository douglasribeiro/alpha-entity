package com.alpha.entity.dto;

import java.io.Serializable;

import javax.validation.constraints.Digits;

public class ImovelDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//boolean numeros = seq.matches("^\\d+$");
	
	private String matricula;
	
	private String complemento;
	
	private Boolean condominio;
	
	private Integer tipo; //TipoImovel;
	
	private Integer edificacao; //TipoEdificacao
	
	private Integer servico; //TipoServico
	
	@Digits(integer = 8, fraction = 0)
	private String areaTotal;
	
	@Digits(integer = 8, fraction = 0)
	private String areaConstruida;
	
	@Digits(integer = 1, fraction = 0)
	private String banheiros;
	
	@Digits(integer = 1, fraction = 0)
	private String quartos;
	
	@Digits(integer = 1, fraction = 0)
	private String suites;
	
	@Digits(integer = 1, fraction = 0)
	private String comodos;
	
	@Digits(integer = 1, fraction = 0)
	private String vagas;
	
	private String observacao;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Boolean getCondominio() {
		return condominio;
	}

	public void setCondominio(Boolean condominio) {
		this.condominio = condominio;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getEdificacao() {
		return edificacao;
	}

	public void setEdificacao(Integer edificacao) {
		this.edificacao = edificacao;
	}

	public Integer getServico() {
		return servico;
	}

	public void setServico(Integer servico) {
		this.servico = servico;
	}

	public String getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(String areaTotal) {
		this.areaTotal = areaTotal;
	}

	public String getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(String areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	public String getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(String banheiros) {
		this.banheiros = banheiros;
	}

	public String getQuartos() {
		return quartos;
	}

	public void setQuartos(String quartos) {
		this.quartos = quartos;
	}

	public String getSuites() {
		return suites;
	}

	public void setSuites(String suites) {
		this.suites = suites;
	}

	public String getComodos() {
		return comodos;
	}

	public void setComodos(String comodos) {
		this.comodos = comodos;
	}

	public String getVagas() {
		return vagas;
	}

	public void setVagas(String vagas) {
		this.vagas = vagas;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
