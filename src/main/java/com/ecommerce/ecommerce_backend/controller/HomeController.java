package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping
    public ApiResponse HomeControllerHandler() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMensaje("Bienvenidos a nuestra dietetica saludable");
        return apiResponse;
    }

}

