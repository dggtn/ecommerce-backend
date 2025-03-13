package com.ecommerce.ecommerce_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cupon {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private double discountPercentage;

    private LocalDate validoInicioFecha;

    private LocalDate validoFinFecha;
    private double ordenMinima;

    private boolean estaActivo = true;


    @ManyToMany(mappedBy= "cuponesUsados")
    private Set<Usuario>usadoPorUsuarios = new HashSet<>();





}
