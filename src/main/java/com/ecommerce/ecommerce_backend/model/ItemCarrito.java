package com.ecommerce.ecommerce_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class ItemCarrito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    @JsonIgnore
    private Carrito carrito;

    private Producto producto;

    private String tamano;
    private int cantidad = 1;

    private Integer precioIva;

    private Integer precioVenta;

    private Long userId;


}
