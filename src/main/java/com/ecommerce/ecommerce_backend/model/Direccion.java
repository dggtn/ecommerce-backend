package com.ecommerce.ecommerce_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String localidad;
    private String direccion;

    private String ciudad;

    private String provincia;

    private String codigoPostal;

    private String telefono;

}
