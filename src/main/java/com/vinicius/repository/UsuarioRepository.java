package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinicius.domain.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer> {
	@Query(value= "select * from Usuario where id = ?", nativeQuery = true)
	Usuario find(int id);
}

