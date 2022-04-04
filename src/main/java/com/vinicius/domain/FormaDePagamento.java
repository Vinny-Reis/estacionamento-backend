package com.vinicius.domain;

import java.util.Objects;

public class FormaDePagamento {

	private int id;
	private String formaPagamento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
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
		FormaDePagamento other = (FormaDePagamento) obj;
		return id == other.id;
	}
	
	public FormaDePagamento() {
		super();
	}
	public FormaDePagamento(int id, String formaPagamento) {
		super();
		this.id = id;
		this.formaPagamento = formaPagamento;
	}
	
	@Override
	public String toString() {
		return "FormaDePagamento [id=" + id + ", formaPagamento=" + formaPagamento + "]";
	}
	
	
	
	
}
