package com.vinicius.domain;

import java.util.Objects;

public class RegistroDePagamento {

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
