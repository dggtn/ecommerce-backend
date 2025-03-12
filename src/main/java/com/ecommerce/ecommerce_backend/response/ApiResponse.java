package com.ecommerce.ecommerce_backend.response;

import lombok.Data;
@Data
public class ApiResponse {
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
