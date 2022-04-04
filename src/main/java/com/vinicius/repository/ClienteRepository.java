package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {
	@Query(value= "select * from Cliente where id = ?", nativeQuery = true)
	Cliente find(int id);
}
