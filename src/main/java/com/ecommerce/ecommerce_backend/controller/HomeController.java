package com.ecommerce.ecommerce_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping
    public String HomeControllerHandler(){
        return "Bienvenidos a nuestra dietetica saludable";
    }
}
