package com.ecommerce.ecommerce_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private String descripcion;
    private int preciomasIva;
    private int precioDeVenta;
    private int cantidad;
    private String color;

    @ElementCollection
    private List<String> imagenes =  new ArrayList<>();

    private int numRatings;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Vendedor vendedor;

    private LocalDateTime CreadoEn;

    private String tamanio;

    @OneToMany(mappedBy = "producto",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Resena> resenas = new ArrayList<>();






}
