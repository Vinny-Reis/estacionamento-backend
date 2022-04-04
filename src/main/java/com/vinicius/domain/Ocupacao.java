package com.vinicius.domain;

import java.util.Date;
import java.util.Objects;

public class Ocupacao {

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
