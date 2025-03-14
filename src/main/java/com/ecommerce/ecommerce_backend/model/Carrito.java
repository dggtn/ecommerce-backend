package com.ecommerce.ecommerce_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Usuario usuario;


    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItemCarrito> itemsDelCarrito = new HashSet<>();

    private   double PrecioTotal;

    private int itemsTotales;

    private int totalMasIva;

    private int descuento;

    private String codigoCupon;

}
