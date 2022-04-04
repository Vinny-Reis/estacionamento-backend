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
		Desocupacao empresa = repo.find(id);

		return empresa;
	}
	public List<Desocupacao> findAll() {
		List<Desocupacao> adms = new ArrayList<Desocupacao>();
		adms = repo.findAll();
		return adms;
	}
}
