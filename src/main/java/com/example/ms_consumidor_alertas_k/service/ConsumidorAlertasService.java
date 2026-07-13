package com.example.ms_consumidor_alertas_k.service;

import com.example.ms_consumidor_alertas_k.model.Alerta;
import com.example.ms_consumidor_alertas_k.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumidorAlertasService {

    @Autowired
    private AlertaRepository alertaRepository;

    @KafkaListener(topics = "alertas", groupId = "alertas-db-group")
    public void consumirYGuardarAlerta(Alerta alerta) {
        
        System.out.println("📥 Alerta recibida desde Kafka para el paciente: " + alerta.getIdPaciente());
        
        // Guardamos directamente en Oracle
        alertaRepository.save(alerta);
        
        System.out.println("💾 Alerta guardada exitosamente en la base de datos.");
    }
}