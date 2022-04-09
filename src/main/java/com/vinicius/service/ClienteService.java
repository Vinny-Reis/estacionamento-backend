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
	
<<<<<<< HEAD
	public void delete (Integer id) {
=======
	public Cliente update(Cliente obj) {
		return repo.save(obj);
	}
	
	
	public void delete(Integer id) {
		find(id);
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}
	
<<<<<<< HEAD
	public Cliente insert(Cliente obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Cliente update(Cliente obj) {
		find(obj.getId());
		return repo.save(obj);
	}
=======
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
	
}
	
