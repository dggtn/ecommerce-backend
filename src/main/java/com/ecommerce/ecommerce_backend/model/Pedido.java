package com.ecommerce.ecommerce_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode


public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    @ManyToOne
    private Usuario usuario;

    private Long vendedorId;

    @OneToMany(mappedBy= "order",cascade =CascadeType.ALL,orphanRemoval = true)
    private List<PedidoItem> orderItems = new ArrayList<>();

    @ManyToOne

    private Direccion direcionDeEntrega;

    @Embedded
    private MetodoDePago metodoDePago = new MetodoDePago();
    private double totalprecioMasIva;
    private Integer totalPrecioVenta;

    private Integer descuento;

    private PedidoEstatus estdtusPedido;








}
