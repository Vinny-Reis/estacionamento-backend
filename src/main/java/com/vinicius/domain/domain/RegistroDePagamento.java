package com.vinicius.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistroDePagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	private Number total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Number getTotal() {
		return total;
	}
	public void setTotal(Number total) {
		this.total = total;
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
		RegistroDePagamento other = (RegistroDePagamento) obj;
		return id == other.id;
	}
	
	public RegistroDePagamento() {
		super();
	}
	public RegistroDePagamento(int id, Number total) {
		super();
		this.id = id;
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "RegistroDePagamento [id=" + id + ", total=" + total + "]";
	}
	
	
	
	
}
