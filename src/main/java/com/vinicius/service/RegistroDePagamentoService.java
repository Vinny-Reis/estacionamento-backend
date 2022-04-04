package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinicius.domain.RegistroDePagamento;
import com.vinicius.repository.RegistroDePagamentoRepository;

public class RegistroDePagamentoService {
	
	@Autowired
	private RegistroDePagamentoRepository repo;
	
	public RegistroDePagamento find(int id) {
		RegistroDePagamento empresa = repo.find(id);

		return empresa;
	}
	public List<RegistroDePagamento> findAll() {
		List<RegistroDePagamento> adms = new ArrayList<RegistroDePagamento>();
		adms = repo.findAll();
		return adms;
	}
}
