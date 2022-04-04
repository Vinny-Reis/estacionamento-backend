package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinicius.domain.FormaDePagamento;
import com.vinicius.repository.FormaDePagamentoRepository;

public class FormaDePagamentoService {
	
	@Autowired
	private FormaDePagamentoRepository repo;
	
	public FormaDePagamento find(int id) {
		FormaDePagamento empresa = repo.find(id);

		return empresa;
	}
	public List<FormaDePagamento> findAll() {
		List<FormaDePagamento> adms = new ArrayList<FormaDePagamento>();
		adms = repo.findAll();
		return adms;
	}
}
