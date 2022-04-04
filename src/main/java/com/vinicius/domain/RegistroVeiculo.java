package com.vinicius.domain;

import java.util.Objects;

public class RegistroVeiculo {

	private int id;
	private String placa;
	
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
		RegistroVeiculo other = (RegistroVeiculo) obj;
		return id == other.id;
	}
	
	public RegistroVeiculo() {
		super();
	}
	public RegistroVeiculo(int id, String placa) {
		super();
		this.id = id;
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return "RegistroVeiculo [id=" + id + ", placa=" + placa + "]";
	}
	
	
	
	
}
