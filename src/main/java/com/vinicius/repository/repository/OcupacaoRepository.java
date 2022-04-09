package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.Ocupacao;

@Repository
public interface OcupacaoRepository  extends JpaRepository<Ocupacao, Integer> {
	@Query(value= "select * from Ocupacao where id = ?", nativeQuery = true)
	Ocupacao find(int id);
}
