package com.vinicius.dto;

import java.io.Serializable;

import com.vinicius.domain.Vaga;

public class VagaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private int numero;
	private String setor;
	
	private int idVeiculo;
	private String placa;
	private String modelo;
	private String cor;
	
	private int idCategoriaVeiculo;
	private String descricao;
	private int valorHora;
		
	public VagaDto(Integer id, int numero, String setor, int idVeiculo, String placa, String modelo, String cor,
			int idCategoriaVeiculo, String descricao, int valorHora) {
		super();
		this.id = id;
		this.numero = numero;
		this.setor = setor;
		
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		
		this.idCategoriaVeiculo = idCategoriaVeiculo;
		this.descricao = descricao;
		this.valorHora = valorHora;
	}


	public VagaDto(Vaga obj) {
		
		this.id = obj.getId();
		this.numero = obj.getNumero();
		this.setor = obj.getSetor();
	
		this.idVeiculo = obj.getVeiculo().getId();
		this.placa = obj.getVeiculo().getPlaca();
		this.modelo = obj.getVeiculo().getModelo();
		this.cor = obj.getVeiculo().getCor();
			
		this.idCategoriaVeiculo = obj.getVeiculo().getCategoriaVeiculo().getId();
		this.descricao = obj.getVeiculo().getCategoriaVeiculo().getDescricao();
		this.valorHora = obj.getVeiculo().getCategoriaVeiculo().getValorHora();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
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
