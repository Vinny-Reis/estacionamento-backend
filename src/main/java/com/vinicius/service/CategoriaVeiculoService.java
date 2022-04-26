package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.vinicius.domain.CategoriaVeiculo;
import com.vinicius.repository.CategoriaVeiculoRepository;

@Service
public class CategoriaVeiculoService {

	@Autowired
	private CategoriaVeiculoRepository repo;
	
	
	public CategoriaVeiculo find(int id) {
		CategoriaVeiculo obj = repo.find(id);
		
		return obj;
	}
	
	public List<CategoriaVeiculo> findAll() {
		List<CategoriaVeiculo> catv = new ArrayList<CategoriaVeiculo>();
		catv = repo.findAll();
		return catv;
	}
	
	
	public CategoriaVeiculo insert(CategoriaVeiculo obj) {
		repo.save(obj);
		return obj;
	}
	
	
	public CategoriaVeiculo update(CategoriaVeiculo obj) {
		find(obj.getId());
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
