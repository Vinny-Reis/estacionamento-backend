package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.vinicius.domain.CategoriaVeiculo;
import com.vinicius.repository.CategoriaVeiculoRepository;

public class CategoriaVeiculoService {

	@Autowired
	private CategoriaVeiculoRepository repo;
	
	public CategoriaVeiculo find(int id) {
		CategoriaVeiculo obj = repo.find(id);

		return obj;
	}
	public List<CategoriaVeiculo> findAll() {
		List<CategoriaVeiculo> catvei = new ArrayList<CategoriaVeiculo>();
		catvei = repo.findAll();
		return catvei;
	}
	

	
	
	public CategoriaVeiculo update(CategoriaVeiculo obj) {
		return repo.save(obj);
	}
	
	
	
	
	
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}
	
	
}
