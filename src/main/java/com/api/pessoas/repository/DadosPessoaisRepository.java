package com.api.pessoas.repository;

import com.api.pessoas.model.DadosPessoais;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface DadosPessoaisRepository extends Repository<DadosPessoais, UUID> {
    DadosPessoais save(DadosPessoais dadosPessoais);
}
