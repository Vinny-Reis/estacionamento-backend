package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.RegistroVeiculo;

@Repository
public interface RegistroVeiculoRepository  extends JpaRepository<RegistroVeiculo, Integer> {
	@Query(value= "select * from RegistroVeiculo where id = ?", nativeQuery = true)
	RegistroVeiculo find(int id);
}

