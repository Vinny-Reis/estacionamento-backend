package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.vinicius.domain.Ocupacao;
import com.vinicius.repository.OcupacaoRepository;

public class OcupacaoService {
	
	@Autowired
	private OcupacaoRepository repo;
	
	public Ocupacao find(int id) {
		Ocupacao obj = repo.find(id);

		return obj;
	}
	public List<Ocupacao> findAll() {
		List<Ocupacao> ocp = new ArrayList<Ocupacao>();
		ocp = repo.findAll();
		return ocp;
	}
	
	public Ocupacao insert(Ocupacao obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Ocupacao update(Ocupacao obj) {
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
