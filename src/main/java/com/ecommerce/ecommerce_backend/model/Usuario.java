package com.ecommerce.ecommerce_backend.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String contrasena;

    private String email;

    private String nombreCompleto;

    private String numeroCelular;

    private String rol;

}
