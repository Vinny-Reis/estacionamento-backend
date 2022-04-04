package com.vinicius.domain;

import java.util.Objects;

public class Vaga {

	private int id;
	private Number numero;
	private String setor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Number getNumero() {
		return numero;
	}
	public void setNumero(Number numero) {
		this.numero = numero;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
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
		Vaga other = (Vaga) obj;
		return id == other.id;
	}
	public Vaga() {
		super();
	}
	public Vaga(int id, Number numero, String setor) {
		super();
		this.id = id;
		this.numero = numero;
		this.setor = setor;
	}
	@Override
	public String toString() {
		return "Vaga [id=" + id + ", numero=" + numero + ", setor=" + setor + "]";
	}
	
	
	
}
