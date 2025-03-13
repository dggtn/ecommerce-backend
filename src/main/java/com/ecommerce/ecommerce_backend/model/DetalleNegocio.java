package com.ecommerce.ecommerce_backend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DetalleNegocio {
    private String nombreNegocio;
    private String mailNegocio;
    private String telefonoNegocio;
    private String direccionNegocio;
    private String logo;
    private String banner;

}
