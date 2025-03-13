package com.ecommerce.ecommerce_backend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleBanco {

    private String numeroCuenta;
    private String duenoCuenta;

    private String codigoCVC;

}
