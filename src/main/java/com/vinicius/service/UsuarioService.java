package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
	
	public Usuario update(Usuario obj) {
		return repo.save(obj);
	}
}
