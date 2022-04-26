package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.vinicius.domain.Desocupacao;
import com.vinicius.repository.DesocupacaoRepository;
@Service
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
	
	
	public Desocupacao insert(Desocupacao obj) {
		repo.save(obj);
		return obj;
	}
	
	public Desocupacao update(Desocupacao obj) {
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
