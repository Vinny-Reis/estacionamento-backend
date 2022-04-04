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
		Usuario empresa = repo.find(id);

		return empresa;
	}
	public List<Usuario> findAll() {
		List<Usuario> adms = new ArrayList<Usuario>();
		adms = repo.findAll();
		return adms;
	}
}
