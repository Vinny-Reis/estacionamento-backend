package com.vinicius.domain;

import java.util.Objects;

public class CategoriaVeiculo {

	private int id;
	private String descricao;
	private Number valorHora;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Number getValorHora() {
		return valorHora;
	}
	public void setValorHora(Number valorHora) {
		this.valorHora = valorHora;
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
		return id == other.id;
	}
	
	
	public CategoriaVeiculo() {
		super();
	}
	public CategoriaVeiculo(int id, String descricao, Number valorHora) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorHora = valorHora;
	}
	
	@Override
	public String toString() {
		return "CategoriaVeiculo [id=" + id + ", descricao=" + descricao + ", valorHora=" + valorHora + "]";
	}
	
	
	
	
	
}
