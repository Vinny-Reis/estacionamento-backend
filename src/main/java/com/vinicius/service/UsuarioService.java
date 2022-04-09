package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.vinicius.domain.Usuario;
import com.vinicius.repository.UsuarioRepository;

public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario find(int id) {
		Usuario obj = repo.find(id);

		return obj;
	}
	public List<Usuario> findAll() {
		List<Usuario> usr = new ArrayList<Usuario>();
		usr = repo.findAll();
		return usr;
	}
<<<<<<< HEAD
	public void delete (Integer id) {
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}
	
	public Usuario insert(Usuario obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Usuario update(Usuario obj) {
		find(obj.getId());
=======
	
	public Usuario update(Usuario obj) {
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
		return repo.save(obj);
	}
}
