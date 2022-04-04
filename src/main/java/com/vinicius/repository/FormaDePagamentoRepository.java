package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.FormaDePagamento;

@Repository
public interface FormaDePagamentoRepository  extends JpaRepository<FormaDePagamento, Integer> {
	@Query(value= "select * from FormaDePagamento where id = ?", nativeQuery = true)
	FormaDePagamento find(int id);
}
