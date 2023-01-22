package br.com.fasda.fasdalog.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fasda.fasdalog.domain.exception.NegocioException;
import br.com.fasda.fasdalog.domain.model.Entrega;
import br.com.fasda.fasdalog.domain.model.StatusEntrega;
import br.com.fasda.fasdalog.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {
	
	private EntregaRepository entregaRepository;
	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		entrega.finalizar();
		
		entregaRepository.save(entrega);
		
	}

}
