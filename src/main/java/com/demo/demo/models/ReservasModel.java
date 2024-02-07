package com.demo.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name =  "reserva")
public class ReservasModel {
    @Id
    @GeneratedValue
    @Column(nullable=false, unique = true)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioModel usuario;

    @ManyToOne
    @JoinColumn(name = "habitacion_id", nullable = false)
    private HabitacionesModel habitacion;

}
