package com.vinicius.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vinicius.domain.Veiculo;
import com.vinicius.dto.VeiculoDto;
import com.vinicius.service.VeiculoService;

@RestController
@RequestMapping (value = "/veiculo")
public class VeiculoResource {

	
	@Autowired
	private VeiculoService service;

	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Veiculo obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<VeiculoDto>> findAll() {
		List<Veiculo> list = service.findAll();
		List<VeiculoDto> listDto = list.stream().map(obj -> new VeiculoDto(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Veiculo> insert(@RequestBody Veiculo obj) {
		Veiculo objNovo = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(objNovo.getId())
				.toUri();
		return ResponseEntity.created(uri).body(objNovo);
	}

	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Veiculo obj, @PathVariable Integer id){
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
