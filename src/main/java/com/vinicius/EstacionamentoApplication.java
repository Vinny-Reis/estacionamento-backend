package com.vinicius;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vinicius.domain.Usuario;
import com.vinicius.repository.UsuarioRepository;

@SpringBootApplication
public class EstacionamentoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoApplication.class, args);
	}


	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	
		Usuario use = new Usuario(null, "cachorrao", "cachorrao@hotmail.com", "uvhfd222", null);
		usuarioRepository.saveAll(Arrays.asList(use));
		
	
	}

}
