package com.vinicius;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vinicius.domain.CategoriaVeiculo;
import com.vinicius.domain.Cliente;
import com.vinicius.domain.Desocupacao;
import com.vinicius.domain.Ocupacao;
import com.vinicius.domain.Usuario;
import com.vinicius.domain.Vaga;
import com.vinicius.domain.Veiculo;
import com.vinicius.repository.CategoriaVeiculoRepository;
import com.vinicius.repository.ClienteRepository;
import com.vinicius.repository.DesocupacaoRepository;
import com.vinicius.repository.OcupacaoRepository;
import com.vinicius.repository.UsuarioRepository;
import com.vinicius.repository.VagaRepository;
import com.vinicius.repository.VeiculoRepository;

@SpringBootApplication
public class EstacionamentoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoApplication.class, args);
	}

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private CategoriaVeiculoRepository categoriaVeiculoRepository;
	
	
	

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Autowired
	private VagaRepository vagaRepository;
	
	
	@Autowired
	private DesocupacaoRepository desocupacaoRepository;
	
	
	@Autowired
	private OcupacaoRepository ocupacaoRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
	
		
		Cliente cli1 = new Cliente(null, "vinicius", "reis", "M", "11453665412", "vinicius@outlook.com");
		clienteRepository.saveAllAndFlush(Arrays.asList(cli1));
		
		
		
		CategoriaVeiculo catv1 = new CategoriaVeiculo(null, "Carro", 10);
		CategoriaVeiculo catv2 = new CategoriaVeiculo(null, "Moto", 5);
		
		Veiculo veic = new Veiculo(null, "AXE-3972", "celta", "cinza", cli1, catv1);
		veic.getCliente();
	
		catv1.getVeiculo().addAll(Arrays.asList(veic));
		categoriaVeiculoRepository.saveAll(Arrays.asList(catv1, catv2));
		veiculoRepository.saveAll(Arrays.asList(veic));
		

		
		Usuario use = new Usuario(null, "cachorrao", "cachorrao@hotmail.com", "uvhfd222", null);
		usuarioRepository.saveAll(Arrays.asList(use));
		
		
		Vaga vag = new Vaga(null, 4, "B");
		vagaRepository.saveAll(Arrays.asList(vag));
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Ocupacao ocp = new Ocupacao(null, sdf.parse("21/10/2021 13:30"));
		ocupacaoRepository.saveAll(Arrays.asList(ocp));
		
		Desocupacao des = new Desocupacao(null, sdf.parse("21/10/2021 14:30"));
		desocupacaoRepository.saveAll(Arrays.asList(des));
		
		
		
		
	}

}
