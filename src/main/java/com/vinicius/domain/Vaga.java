package com.vinicius.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Vaga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer id;
	private int numero;
	private String setor;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataEnt;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataSaida;
	
	@ManyToOne
	private Veiculo veiculo;

	
	public Vaga() {
		super();
	}


	public Vaga(Integer id, int numero, String setor, Date dataEnt, Date dataSaida, Veiculo veiculo) {
		super();
		this.id = id;
		this.numero = numero;
		this.setor = setor;
		this.dataEnt = dataEnt;
		this.dataSaida = dataSaida;
		this.veiculo = veiculo;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public int getNumero() {
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


	public Date getDataEnt() {
		return dataEnt;
	}


	public void setDataEnt(Date dataEnt) {
		this.dataEnt = dataEnt;
	}


	public Date getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
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
		Vaga other = (Vaga) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Vaga [id=" + id + ", numero=" + numero + ", setor=" + setor + ", dataEnt=" + dataEnt + ", dataSaida="
				+ dataSaida + ", veiculo=" + veiculo + "]";
	}
	

	
	
	
	
}
