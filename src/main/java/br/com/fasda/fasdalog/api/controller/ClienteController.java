package br.com.fasda.fasdalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fasda.fasdalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Flávio");
		cliente1.setTelefone("81 984633488");
		cliente1.setEmail("flavio@fasda.com.br");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("81 988888888");
		cliente2.setEmail("maria@fasda.com.br");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
