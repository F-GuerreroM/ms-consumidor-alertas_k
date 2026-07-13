package com.example.ms_consumidor_alertas_k.repository;

import com.example.ms_consumidor_alertas_k.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertaRepository extends JpaRepository<Alerta, Long> {
}