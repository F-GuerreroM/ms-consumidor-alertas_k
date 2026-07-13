package com.example.ms_consumidor_alertas_k.controller;

import com.example.ms_consumidor_alertas_k.model.Alerta;
import com.example.ms_consumidor_alertas_k.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/alertas")
public class AlertaController {

    @Autowired
    private AlertaRepository alertaRepository;

    @GetMapping
    public List<Alerta> listarAlertas() {
        // Devuelve todas las alertas guardadas en Oracle en formato JSON
        return alertaRepository.findAll();
    }
}