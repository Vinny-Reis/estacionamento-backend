package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.Vaga;

@Repository
public interface VagaRepository  extends JpaRepository<Vaga, Integer> {
	@Query(value= "select * from Vaga where id = ?", nativeQuery = true)
	Vaga find(int id);
}
