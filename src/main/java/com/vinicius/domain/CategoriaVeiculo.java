package com.vinicius.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CategoriaVeiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private int valorHora;
	
	@JsonIgnore
	@OneToMany(mappedBy = "categoriaVeiculo")
	private List<Veiculo> veiculo = new ArrayList<>();
	
	
	public CategoriaVeiculo() {
		super();
	}
	public CategoriaVeiculo(Integer id, String descricao, int valorHora) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorHora = valorHora;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getValorHora() {
		return valorHora;
	}
	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}
	public List<Veiculo> getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaVeiculo other = (CategoriaVeiculo) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "CategoriaVeiculo [id=" + id + ", descricao=" + descricao + ", valorHora=" + valorHora + "]";
	}
	
	
	
	
	

	
	
	
	
	
}
