package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.vinicius.domain.RegistroDePagamento;
import com.vinicius.repository.RegistroDePagamentoRepository;

public class RegistroDePagamentoService {
	
	@Autowired
	private RegistroDePagamentoRepository repo;
	
	public RegistroDePagamento find(int id) {
		RegistroDePagamento obj = repo.find(id);

		return obj;
	}
	public List<RegistroDePagamento> findAll() {
		List<RegistroDePagamento> rdpag = new ArrayList<RegistroDePagamento>();
		rdpag = repo.findAll();
		return rdpag;
	}

	
	
	public RegistroDePagamento insert(RegistroDePagamento obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public RegistroDePagamento update(RegistroDePagamento obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete (Integer id) {
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}

}
