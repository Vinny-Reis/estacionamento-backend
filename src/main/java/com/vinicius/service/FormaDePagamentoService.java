package com.vinicius.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.vinicius.domain.FormaDePagamento;
import com.vinicius.repository.FormaDePagamentoRepository;

public class FormaDePagamentoService {
	
	@Autowired
	private FormaDePagamentoRepository repo;
	
	public FormaDePagamento find(int id) {
		FormaDePagamento obj = repo.find(id);

		return obj;
	}
	public List<FormaDePagamento> findAll() {
		List<FormaDePagamento> fdpag = new ArrayList<FormaDePagamento>();
		fdpag = repo.findAll();
		return fdpag;
	}
<<<<<<< HEAD
	public void delete (Integer id) {
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("");
		}
	}
	
	public FormaDePagamento insert(FormaDePagamento obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public FormaDePagamento update(FormaDePagamento obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
=======
	
	
	public FormaDePagamento update(FormaDePagamento obj) {
		return repo.save(obj);
	}
>>>>>>> 607d03a97b3b979242279f61d9a91b9683dcbbc2
}
