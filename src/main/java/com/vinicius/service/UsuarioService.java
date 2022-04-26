package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.vinicius.domain.Usuario;
import com.vinicius.repository.UsuarioRepository;
@Service
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
	
	public Usuario insert(Usuario obj) {
		repo.save(obj);
		return obj;
	}
	
	public Usuario update(Usuario obj) {
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
