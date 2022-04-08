package com.vinicius.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 

	private int id;
	private String nome;
	private String sobreNome;
	private String sexo;
	private String cpf;
	private String email;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		Cliente other = (Cliente) obj;
		return id == other.id;
	}
	
	public Cliente() {
		super();
	}
	public Cliente(int id, String nome, String sobreNome, String sexo, String cpf, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", sexo=" + sexo + ", cpf=" + cpf
				+ ", email=" + email + "]";
	}
	
	
	
}
