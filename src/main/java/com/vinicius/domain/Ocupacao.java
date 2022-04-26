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
public class Ocupacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataEnt;
	public Ocupacao() {
		super();
	}
	public Ocupacao(Integer id, Date dataEnt) {
		super();
		this.id = id;
		this.dataEnt = dataEnt;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataEnt() {
		return dataEnt;
	}
	public void setDataEnt(Date dataEnt) {
		this.dataEnt = dataEnt;
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
		Ocupacao other = (Ocupacao) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Ocupacao [id=" + id + ", dataEnt=" + dataEnt + ", horaEnt=" + "]";
	}
	
	
	
}
