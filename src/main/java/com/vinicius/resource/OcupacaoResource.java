package com.vinicius.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.domain.Ocupacao;
import com.vinicius.service.OcupacaoService;

@RestController
@RequestMapping (value = "/Ocupacao")
public class OcupacaoResource {

	@Autowired
	private OcupacaoService service;

	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Ocupacao obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Ocupacao> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Ocupacao obj, @PathVariable Integer id){
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
}
