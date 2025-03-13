package com.ecommerce.ecommerce_backend.model;


import com.ecommerce.ecommerce_backend.dominio.EstatusCuenta;
import com.ecommerce.ecommerce_backend.dominio.Roles;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Vendedor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nombreVendedor;

    private String telefono;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    @Embedded
    private DetalleNegocio detallesNegocio = new DetalleNegocio();

    @Embedded
    private DetalleBanco detalleBanco = new DetalleBanco();

    @OneToOne(cascade = CascadeType.ALL)
    private Direccion direccionEntrega = new Direccion();

    private String GSTIN;
    private Roles rol = Roles.ROL_USUARIO;
    private boolean elEmailEsVerificado = false;

    private EstatusCuenta estatusCuenta = EstatusCuenta.VERIFICACION_PENDIENTE;







}