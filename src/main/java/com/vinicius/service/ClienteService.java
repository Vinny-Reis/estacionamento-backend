package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.vinicius.domain.Cliente;
import com.vinicius.repository.ClienteRepository;

public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(int id) {
		Cliente obj = repo.find(id);

		return obj;
	}
	public List<Cliente> findAll() {
		List<Cliente> clit = new ArrayList<Cliente>();
		clit = repo.findAll();
		return clit;
	}
		

	public Cliente insert(Cliente obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Cliente update(Cliente obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);

		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}

	
}
	
