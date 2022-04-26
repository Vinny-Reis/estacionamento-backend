package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.Veiculo;

@Repository
public interface VeiculoRepository  extends JpaRepository<Veiculo, Integer> {
	@Query(value= "select * from veiculo where id = ?", nativeQuery = true)
	Veiculo find(int id);
}

