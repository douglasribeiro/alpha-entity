package com.alpha.entity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.alpha.entity.model.enums.TipoEdificacao;
import com.alpha.entity.model.enums.TipoImovel;
import com.alpha.entity.model.enums.TipoServico;

@Entity
public class Imovel implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Endereco endereco;
	
	@Column(length = 80)
	private String Logradouro;
	
	
	@Column(length = 8)
	private String numero;
	
	@Column(length = 100)
	private String nomProprietario;
	
	@Column(length = 20)
	private String matricula;
	
	@Column(length = 256)
	private String complemento;
	
	private Boolean condominio;
	
	private Integer tipo; //TipoImovel;
	
	private Integer edificacao; //TipoEdificacao
	
	private Integer servico; //TipoServico
	
	@Column(length = 20)
	private String areaTotal;
	
	@Column(length = 20)
	private String areaConstruida;
	
	@Column(length = 20)
	private String banheiros;
	
	@Column(length = 20)
	private String quartos;
	
	@Column(length = 20)
	private String suites;
	
	@Column(length = 20)
	private String comodos;
	
	@Column(length = 20)
	private String vagas;
	
	@Column(length = 256)
	private String observacao;
	
	private Set<String> fotos = new HashSet<>();
		
	private List<Proprietario> proprietario = new ArrayList<>();
		
	public Imovel() {}
	
	public Imovel(Long id, Endereco endereco, String Logradouro, String numero, String nomProprietario, String matricula, 
			String complemento, Boolean condominio, Integer tipo, Integer edificacao, Integer servico, String areaTotal, 
			String areaConstruida, String banheiros, String quartos, String suites, String comodos, String vagas, 
			String observacao) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.Logradouro = Logradouro;
		this.numero = numero;
		this.nomProprietario = nomProprietario;
		this.matricula = matricula;
		this.complemento = complemento;
		this.condominio = condominio;
		this.tipo = tipo;
		this.edificacao = edificacao;
		this.servico = servico;
		this.areaTotal = areaTotal;
		this.areaConstruida = areaConstruida;
		this.banheiros = banheiros;
		this.quartos = quartos;
		this.suites = suites;
		this.comodos = comodos;
		this.vagas = vagas;
		this.observacao = observacao;
	}
	
	public Imovel(Long id, Endereco endereco, String matricula, 
			String complemento, Boolean condominio, Integer tipo, Integer edificacao, Integer servico, String areaTotal, 
			String areaConstruida, String banheiros, String quartos, String suites, String comodos, String vagas, 
			String observacao) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.matricula = matricula;
		this.complemento = complemento;
		this.condominio = condominio;
		this.tipo = tipo;
		this.edificacao = edificacao;
		this.servico = servico;
		this.areaTotal = areaTotal;
		this.areaConstruida = areaConstruida;
		this.banheiros = banheiros;
		this.quartos = quartos;
		this.suites = suites;
		this.comodos = comodos;
		this.vagas = vagas;
		this.observacao = observacao;
	}


	//@Override
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}	
	

	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="endereco_id")
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

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
	
	public TipoImovel getTipo() {
		return TipoImovel.toEnum(tipo);
	}

	public void setTipo(TipoImovel tipo) {
		this.tipo = tipo.getCodigo();
	}

	public TipoEdificacao getEdificacao() {
		return TipoEdificacao.toEnum(edificacao);
	}

	public void setEdificacao(TipoEdificacao edificacao) {
		this.edificacao = edificacao.getCodigo();
	}

	public TipoServico getServico() {
		return TipoServico.toEnum(servico);
	}

	public void setServico(TipoServico servico) {
		this.servico = servico.getCodigo();
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

	@ElementCollection
	@CollectionTable(name="FOTO")
	public Set<String> getFotos() {
		return fotos;
	}

	public void setFotos(Set<String> fotos) {
		this.fotos = fotos;
	}

	@Transient
	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	@Transient
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Transient
	public String getNomProprietario() {
		return nomProprietario;
	}

	public void setNomProprietario(String nomProprietario) {
		this.nomProprietario = nomProprietario;
	}

	//@JsonIgnore
	@ManyToMany(mappedBy = "imoveis", cascade = CascadeType.ALL)
	public List<Proprietario> getProprietarios() {
		return proprietario;
	}

	public void setProprietarios(List<Proprietario> proprietario) {
		this.proprietario = proprietario;
	}
	
	
	
}
