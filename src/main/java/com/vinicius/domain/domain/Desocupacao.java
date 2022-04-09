package com.vinicius.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Desocupacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private int horaSaida;
	private Date dataSaida;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
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
		Desocupacao other = (Desocupacao) obj;
		return id == other.id;
	}
	
	public Desocupacao() {
		super();
	}
	public Desocupacao(int id, int horaSaida, Date dataSaida) {
		super();
		this.id = id;
		this.horaSaida = horaSaida;
		this.dataSaida = dataSaida;
	}
	
	@Override
	public String toString() {
		return "Desocupacao [id=" + id + ", horaSaida=" + horaSaida + ", dataSaida=" + dataSaida + "]";
	}
	
	
	
	
}