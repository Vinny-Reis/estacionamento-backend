package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
	
	public Veiculo update(Veiculo obj) {
		return repo.save(obj);
	}
}
