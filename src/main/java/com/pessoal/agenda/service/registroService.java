package com.pessoal.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.agenda.model.Registro;
import com.pessoal.agenda.repository.registroRepository;

@Service
public class registroService {
    
    @Autowired
    private registroRepository registroRepository;

    public Registro criarRegistro(Registro registro) {
        return registroRepository.save(registro);
}
}