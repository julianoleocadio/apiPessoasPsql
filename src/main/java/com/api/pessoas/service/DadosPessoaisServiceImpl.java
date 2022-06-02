package com.api.pessoas.service;

import com.api.pessoas.model.DadosPessoais;
import com.api.pessoas.repository.DadosPessoaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosPessoaisServiceImpl implements DadosPessoaisService {

    @Autowired
    private DadosPessoaisRepository dadosPessoaisRepository;


    @Override
    public DadosPessoais incluirPessoa(DadosPessoais dadosPessoais) {
        return dadosPessoaisRepository.save(dadosPessoais);
    }
}
