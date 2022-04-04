package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinicius.domain.CategoriaVeiculo;
import com.vinicius.repository.CategoriaVeiculoRepository;

public class CategoriaVeiculoService {

	@Autowired
	private CategoriaVeiculoRepository repo;
	
	public CategoriaVeiculo find(int id) {
		CategoriaVeiculo empresa = repo.find(id);

		return empresa;
	}
	public List<CategoriaVeiculo> findAll() {
		List<CategoriaVeiculo> adms = new ArrayList<CategoriaVeiculo>();
		adms = repo.findAll();
		return adms;
	}
	
}
