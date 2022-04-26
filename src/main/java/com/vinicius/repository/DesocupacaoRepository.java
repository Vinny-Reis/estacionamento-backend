package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.Desocupacao;

@Repository
public interface DesocupacaoRepository  extends JpaRepository<Desocupacao, Integer> {
	@Query(value= "select * from desocupacao where id = ?", nativeQuery = true)
	Desocupacao find(int id);
}





