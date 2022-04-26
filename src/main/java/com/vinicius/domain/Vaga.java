package com.vinicius.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vaga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer id;
	private int numero;
	private String setor;
	
	@ManyToOne
	private Ocupacao ocupacao;
	
	
	
	public Vaga() {
		super();
	}
	public Vaga(Integer id, int numero, String setor) {
		super();
		this.id = id;
		this.numero = numero;
		this.setor = setor;
		
	}
	
	
	public Ocupacao getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Number getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Vaga [id=" + id + ", numero=" + numero + ", setor=" + setor + "]";
	}
	
	
	
	
	
}
