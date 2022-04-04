package com.vinicius.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.domain.RegistroVeiculo;
import com.vinicius.service.RegistroVeiculoService;

@RestController
@RequestMapping (value = "/RegistroVeiculo")
public class RegistroVeiculoResource {

	
	@Autowired
	private RegistroVeiculoService service;

	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		RegistroVeiculo obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<RegistroVeiculo> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	
}
