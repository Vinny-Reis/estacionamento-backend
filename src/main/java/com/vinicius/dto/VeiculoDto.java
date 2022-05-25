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
	
	private Integer idCliente;
	private String nome;
	private String sobreNome;
	private String sexo;
	private String cpf;
	private String email;

	
	public VeiculoDto(Integer id, String placa, String modelo, String cor, int idCategoriaVeiculo, String descricao,
					  int valorHora,Integer idCliente,String nome, String sobreNome, String sexo ,String cpf, 
					  String email) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		
		this.idCategoriaVeiculo = idCliente;
		this.descricao = descricao;
		this.valorHora = valorHora;
		
		this.idCliente = idCliente;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.email = email;
	}

	public VeiculoDto(Veiculo obj) {
		
		this.id = obj.getId();
		this.placa = obj.getPlaca();
		this.modelo = obj.getModelo();
		this.cor = obj.getCor();
	
		this.idCategoriaVeiculo = obj.getCategoriaVeiculo().getId();
		this.descricao = obj.getCategoriaVeiculo().getDescricao();
		this.valorHora = obj.getCategoriaVeiculo().getValorHora();
		
		this.idCliente = obj.getCliente().getId();
		this.nome = obj.getCliente().getNome();
		this.sobreNome = obj.getCliente().getSobreNome();
		this.sexo = obj.getCliente().getSexo();
		this.cpf = obj.getCliente().getCpf();
		this.email = obj.getCliente().getEmail();
	}

	public Integer getIdVeiculo() {
		return idCliente;
	}

	public void setIdVeiculo(Integer idVeiculo) {
		this.idCliente = idVeiculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
