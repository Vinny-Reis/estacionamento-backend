package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.CategoriaVeiculo;

@Repository
public interface CategoriaVeiculoRepository  extends JpaRepository<CategoriaVeiculo, Integer> {
	@Query(value= "select * from categoriaVeiculo where id = ?", nativeQuery = true)
	CategoriaVeiculo find(Integer id);
}
