package com.servico.backservico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servico.backservico.repository.ServicoRepository;

@Service
public class ServicoService {
    
    @Autowired
    private ServicoRepository servicoRepository;

    


}
