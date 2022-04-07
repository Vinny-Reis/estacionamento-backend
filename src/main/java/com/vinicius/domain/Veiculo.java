package com.vinicius.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	private String placa;
	private String modelo;
	private String cor;
	
	@ManyToOne
	private CategoriaVeiculo catveiculo;
	
	public Veiculo() {
		super();
	}
	public Veiculo(int id, String placa, String modelo, String cor) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
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
		return id == other.id;
	}
	
	
	@Override
	public String toString() {
		return "RegistroVeiculo [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", cor=" + cor + "]";
	}
	
	
	
	
}
