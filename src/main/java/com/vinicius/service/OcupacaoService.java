package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinicius.domain.Ocupacao;
import com.vinicius.repository.OcupacaoRepository;

public class OcupacaoService {
	
	@Autowired
	private OcupacaoRepository repo;
	
	public Ocupacao find(int id) {
		Ocupacao empresa = repo.find(id);

		return empresa;
	}
	public List<Ocupacao> findAll() {
		List<Ocupacao> adms = new ArrayList<Ocupacao>();
		adms = repo.findAll();
		return adms;
	}
}
