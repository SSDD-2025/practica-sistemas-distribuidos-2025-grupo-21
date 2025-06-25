package com.example.reservaaulas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AulaController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a Reserva de Aulas!");
        return "home"; // nombre de la plantilla Thymeleaf: home.html
    }
}

