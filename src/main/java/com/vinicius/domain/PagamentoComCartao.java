package com.vinicius.domain;



import javax.persistence.Entity;

import com.vinicius.domain.enums.EstadoPagamento;

@Entity

public class PagamentoComCartao  extends Pagamento{
	
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	
	public PagamentoComCartao() {
		super();
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Cliente cliente, Integer numeroDeParcelas) {
		super(id, estado, cliente);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	
	
	
}
