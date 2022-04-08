package com.vinicius.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.domain.RegistroDePagamento;
import com.vinicius.service.RegistroDePagamentoService;

@RestController
@RequestMapping (value = "/RegistroDePagamento")
public class RegistroDePagamentoResource {

	@Autowired
	private RegistroDePagamentoService service;

	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		RegistroDePagamento obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<RegistroDePagamento> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody RegistroDePagamento obj, @PathVariable Integer id){
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
}
