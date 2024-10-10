package com.pessoal.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.agenda.model.Registro;

public interface registroRepository extends JpaRepository<Registro, Long> {
    
}
