package com.vinicius.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.service.CategoriaVeiculoService;
import com.vinicius.domain.CategoriaVeiculo;

@RestController	
@RequestMapping (value = "/CategoriaVeiculo")
public class CategoriaVeiculoResource {
	
	@Autowired
	private CategoriaVeiculoService service;

	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		CategoriaVeiculo obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<CategoriaVeiculo> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
}
