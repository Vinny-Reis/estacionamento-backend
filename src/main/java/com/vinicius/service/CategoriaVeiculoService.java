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
	
<<<<<<< HEAD
	public void delete(Integer id) {
=======

	
	
	public CategoriaVeiculo update(CategoriaVeiculo obj) {
		return repo.save(obj);
	}
	
	
	
	
	
	
	public void delete(Integer id) {
		find(id);
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}
	
<<<<<<< HEAD
	public CategoriaVeiculo insert(CategoriaVeiculo obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public CategoriaVeiculo update(CategoriaVeiculo obj) {
		find(obj.getId());
		return repo.save(obj);
	}
=======
	
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
}
