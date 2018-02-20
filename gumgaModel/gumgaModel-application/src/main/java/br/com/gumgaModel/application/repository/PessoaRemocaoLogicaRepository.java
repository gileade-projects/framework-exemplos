package br.com.gumgaModel.application.repository;

import io.gumga.domain.repository.GumgaCrudRepository;
import br.com.gumgaModel.domain.model.PessoaRemocaoLogica;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRemocaoLogicaRepository extends GumgaCrudRepository<PessoaRemocaoLogica, Long> {}