package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinicius.domain.Desocupacao;
import com.vinicius.repository.DesocupacaoRepository;

public class DesocupacaoService {
	
	@Autowired
	private DesocupacaoRepository repo;
	
	public Desocupacao find(int id) {
		Desocupacao obj = repo.find(id);

		return obj;
	}
	public List<Desocupacao> findAll() {
		List<Desocupacao> desc = new ArrayList<Desocupacao>();
		desc = repo.findAll();
		return desc;
	}
	
	public Desocupacao update(Desocupacao obj) {
		return repo.save(obj);
	}
	
}
