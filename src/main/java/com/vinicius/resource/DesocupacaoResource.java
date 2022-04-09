package com.vinicius.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vinicius.domain.Desocupacao;
import com.vinicius.service.DesocupacaoService;

@RestController
@RequestMapping (value = "/Desocupacao")
public class DesocupacaoResource {

	@Autowired
	private DesocupacaoService service;

	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Desocupacao obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Desocupacao> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	
<<<<<<< HEAD
	@RequestMapping (method = RequestMethod.POST )
	public ResponseEntity<Void> insert(@RequestBody Desocupacao obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
=======
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Desocupacao obj, @PathVariable Integer id){
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
<<<<<<< HEAD
	
	@RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
=======
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
}
