package br.com.fasda.fasdalog.domain.service;

import org.springframework.stereotype.Service;

import br.com.fasda.fasdalog.domain.exception.EntidadeNaoEncontradaException;
import br.com.fasda.fasdalog.domain.model.Entrega;
import br.com.fasda.fasdalog.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada!"));
	}

}
