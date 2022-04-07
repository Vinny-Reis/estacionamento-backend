package com.vinicius.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ocupacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	private Date dataEnt;
	private int horaEnt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataEnt() {
		return dataEnt;
	}
	public void setDataEnt(Date dataEnt) {
		this.dataEnt = dataEnt;
	}
	public int getHoraEnt() {
		return horaEnt;
	}
	public void setHoraEnt(int horaEnt) {
		this.horaEnt = horaEnt;
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
		return id == other.id;
	}
	
	public Ocupacao() {
		super();
	}
	public Ocupacao(int id, Date dataEnt, int horaEnt) {
		super();
		this.id = id;
		this.dataEnt = dataEnt;
		this.horaEnt = horaEnt;
	}
	
	@Override
	public String toString() {
		return "Ocupacao [id=" + id + ", horaEnt=" + horaEnt + "]";
	}
	
	
	
}
