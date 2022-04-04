package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinicius.domain.RegistroVeiculo;
import com.vinicius.repository.RegistroVeiculoRepository;

public class RegistroVeiculoService {
	
	@Autowired
	private RegistroVeiculoRepository repo;
	
	public RegistroVeiculo find(int id) {
		RegistroVeiculo empresa = repo.find(id);

		return empresa;
	}
	public List<RegistroVeiculo> findAll() {
		List<RegistroVeiculo> adms = new ArrayList<RegistroVeiculo>();
		adms = repo.findAll();
		return adms;
	}
}
