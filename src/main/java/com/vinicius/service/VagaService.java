package com.vinicius.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.vinicius.domain.Vaga;
import com.vinicius.repository.VagaRepository;
@Service
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
	
	
	public Vaga insert(Vaga obj) {
		
		obj.setDataEnt(new Date(System.currentTimeMillis()));
		obj.setDataSaida(new Date(System.currentTimeMillis()));
		
		return repo.save(obj);
	}
	
	public Vaga update(Vaga obj) {
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
