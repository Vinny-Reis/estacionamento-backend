package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinicius.domain.Vaga;
import com.vinicius.repository.VagaRepository;

public class VagaService {
	
	@Autowired
	private VagaRepository repo;
	
	public Vaga find(int id) {
		Vaga obj = repo.find(id);

		return obj;
	}
	public List<Vaga> findAll() {
		List<Vaga> vag = new ArrayList<Vaga>();
		vag = repo.findAll();
		return vag;
	}
}
