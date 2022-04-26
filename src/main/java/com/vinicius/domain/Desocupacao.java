package com.vinicius.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Desocupacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataSaida;
	
	public Desocupacao() {
		super();
	}
	public Desocupacao(Integer id, Date dataSaida) {
		super();
		this.id = id;
		
		this.dataSaida = dataSaida;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
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
		Desocupacao other = (Desocupacao) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Desocupacao [id=" + id + ", horaSaida=" + ", dataSaida=" + dataSaida + "]";
	}
	
	
	
	
	
	
	
}
