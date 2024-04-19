package com.example.tutoria.controller;

import com.example.tutoria.entidades.Conductor;
import com.example.tutoria.service.impl.ConductorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/conductor")
@RestController
public class ConductorController {
    /*
    @PostMapping.
        Para persistir información.
        Los datos viajan en el body.
        Las contraseñas viajan en el body.
    @GetMapping.
        Para obtener información.
        Los datos viajan en la URL.
    @PutMapping
        Los datos viajan en el body.
    @DeleteMapping
        Los datos viajan en el body.
        Los datos viajan en la URL.
     */

    @Autowired //Lo que hace es traer un objeto e inyectarlo.
    private ConductorServiceImpl conductorService;

    @PostMapping("/crear") // END POINT
    public Conductor crearConductorController(@RequestBody Conductor conductor){
        return conductorService.crearConductor(conductor);
    }

    @GetMapping("/consultar/{Id}")
    public Conductor consultarConductorController(@PathVariable Integer Id){
        return conductorService.consultarConductorPorId(Id);
    }


}
