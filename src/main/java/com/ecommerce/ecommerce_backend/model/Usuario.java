package com.ecommerce.ecommerce_backend.model;
import com.ecommerce.ecommerce_backend.dominio.Roles;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

import static com.ecommerce.ecommerce_backend.dominio.Roles.ROL_USUARIO;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String contrasena;

    private String email;

    private String nombreCompleto;

    private String numeroCelular;

    private Roles rol = ROL_USUARIO.ROL_VENDEDOR;

    private Set<Direccion> direcciones =  new HashSet<>();

    private Set<Cupon> cuponUsado =  new HashSet<>();



}
