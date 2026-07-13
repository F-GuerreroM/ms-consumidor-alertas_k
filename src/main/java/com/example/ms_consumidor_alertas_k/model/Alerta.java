package com.example.ms_consumidor_alertas_k.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ALERTAS_MEDICAS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Oracle generará este ID automáticamente

    @Column(name = "id_paciente")
    private String idPaciente;

    @Column(name = "tipo_anomalia")
    private String tipoAnomalia;

    @Column(name = "nivel_gravedad")
    private String nivelGravedad;
}