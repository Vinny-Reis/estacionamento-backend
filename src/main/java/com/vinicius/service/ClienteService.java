package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.vinicius.domain.Cliente;
import com.vinicius.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(int id) {
		Cliente obj = repo.find(id);

		return obj;
	}
	
	public List<Cliente> findAll() {
		List<Cliente> cli = new ArrayList<Cliente>();
		cli = repo.findAll();
		return cli;
	}
	

	public Cliente insert(Cliente obj) {
		repo.save(obj);
		return obj;
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
	
