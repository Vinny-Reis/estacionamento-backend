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
		FormaDePagamento obj = repo.find(id);

		return obj;
	}
	public List<FormaDePagamento> findAll() {
		List<FormaDePagamento> fdpag = new ArrayList<FormaDePagamento>();
		fdpag = repo.findAll();
		return fdpag;
	}
}
