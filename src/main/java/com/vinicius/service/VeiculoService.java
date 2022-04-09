package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.vinicius.domain.Veiculo;
import com.vinicius.repository.VeiculoRepository;

public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repo;
	
	public Veiculo find(int id) {
		Veiculo obj = repo.find(id);

		return obj;
	}
	public List<Veiculo> findAll() {
		List<Veiculo> rveic = new ArrayList<Veiculo>();
		rveic = repo.findAll();
		return rveic;
	}
	public void delete (Integer id) {
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}
	
	
	public Veiculo insert(Veiculo obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Veiculo update(Veiculo obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	
}
