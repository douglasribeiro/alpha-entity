package com.alpha.entity.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Foto  extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Column(length = 80)
	private String path;
	
	@Column(length = 50)
	private String descr;
	
	@Column(length = 100)
	private String arquivo;
	
	private Imovel imovel;
	
	public Foto() {}
	
	public Foto(Long id, String path, String descr, String arquivo, Imovel imovel) {
		super();
		this.id = id;
		this.path = path;
		this.descr = descr;
		this.imovel = imovel;
		this.arquivo = arquivo;
	}

	@Override
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="imovel_id")
	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	

}
