package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinicius.domain.Cliente;
import com.vinicius.repository.ClienteRepository;

public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(int id) {
		Cliente empresa = repo.find(id);

		return empresa;
	}
	public List<Cliente> findAll() {
		List<Cliente> adms = new ArrayList<Cliente>();
		adms = repo.findAll();
		return adms;
	}
	
}
