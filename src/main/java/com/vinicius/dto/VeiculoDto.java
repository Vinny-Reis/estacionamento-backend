package com.vinicius.dto;

import java.io.Serializable;

import com.vinicius.domain.Veiculo;

public class VeiculoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String placa;
	private String modelo;
	private String cor;
	
	private int idCategoriaVeiculo;
	private String descricao;
	private int valorHora;
	
	public VeiculoDto(Integer id, String placa, String modelo, String cor, int idCategoriaVeiculo, String descricao,
					  int valorHora) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.idCategoriaVeiculo = idCategoriaVeiculo;
		this.descricao = descricao;
		this.valorHora = valorHora;
	}

	public VeiculoDto(Veiculo obj) {
		
		this.id = obj.getId();
		this.placa = obj.getPlaca();
		this.modelo = obj.getModelo();
		this.cor = obj.getCor();
		this.idCategoriaVeiculo = obj.getCategoriaVeiculo().getId();
		this.descricao = obj.getCategoriaVeiculo().getDescricao();
		this.valorHora = obj.getCategoriaVeiculo().getValorHora();	
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdCategoriaVeiculo() {
		return idCategoriaVeiculo;
	}

	public void setIdCategoriaVeiculo(int idCategoriaVeiculo) {
		this.idCategoriaVeiculo = idCategoriaVeiculo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValorHora() {
		return valorHora;
	}

	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}

	
	
	
}
