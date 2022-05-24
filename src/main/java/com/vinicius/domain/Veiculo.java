package com.vinicius.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer id;
	private String placa;
	private String modelo;
	private String cor;
	
	@JsonIgnore
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private CategoriaVeiculo categoriaVeiculo;
	
	
	
	public Veiculo() {
		super();
	}

	public Veiculo(Integer id, String placa, String modelo, String cor, Cliente cliente, CategoriaVeiculo categoriaVeiculo) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.cliente = cliente;
		this.categoriaVeiculo = categoriaVeiculo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public CategoriaVeiculo getCategoriaVeiculo() {
		return categoriaVeiculo;
	}

	public void setCategoriaVeiculo(CategoriaVeiculo categoriaVeiculo) {
		this.categoriaVeiculo = categoriaVeiculo;
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
		Veiculo other = (Veiculo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", cor=" + cor + "]";
	}

	public int idOcupacao() {
		return 0;
	}

	
	
	
	
}
