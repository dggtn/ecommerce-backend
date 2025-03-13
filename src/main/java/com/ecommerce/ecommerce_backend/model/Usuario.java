package com.ecommerce.ecommerce_backend.model;
import com.ecommerce.ecommerce_backend.dominio.Rol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

import static com.ecommerce.ecommerce_backend.dominio.Rol.ROL_USUARIO;


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

    private Rol rol = ROL_USUARIO.ROL_VENDEDOR;

    @OneToMany
    private Set<Direccion> direcciones =  new HashSet<>();
    @ManyToMany
    @JsonIgnore
    private Set<Cupon> cuponUsado =  new HashSet<>();



}
