package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

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
	
<<<<<<< HEAD
	public void delete (Integer id) {
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}
	
	public Vaga insert(Vaga obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Vaga update(Vaga obj) {
		find(obj.getId());
=======
	public Vaga update(Vaga obj) {
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
		return repo.save(obj);
	}
}
