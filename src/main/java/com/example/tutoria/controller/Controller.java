package com.example.tutoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class Controller {
    @GetMapping("/hola")
    public String hola(){
        return "Hola a todos";
    }

    @GetMapping("/adios")
    public String adios(){
        return "Adios a todos";
    }
}
