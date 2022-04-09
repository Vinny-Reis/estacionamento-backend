package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.RegistroDePagamento;

@Repository
public interface RegistroDePagamentoRepository  extends JpaRepository<RegistroDePagamento, Integer> {
	@Query(value= "select * from RegistroDePagamento where id = ?", nativeQuery = true)
	RegistroDePagamento find(int id);
}

