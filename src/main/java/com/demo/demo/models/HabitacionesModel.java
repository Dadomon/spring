package com.demo.demo.models;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name =  "habitacion")
public class HabitacionesModel {
    @Id
    @GeneratedValue
    @Column(nullable=false, unique = true)
    private Long id;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<HabitacionesModel> habitacion;

}
