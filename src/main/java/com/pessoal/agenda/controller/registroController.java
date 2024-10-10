package com.pessoal.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registroController {
    @GetMapping("/")
    public String novoRegistro() {
        return "registro";
    }
    @GetMapping("/registroForm")
    public String novoForm() {
        return "registerForm";
}
}
