package com.example.tutoria.service;

import com.example.tutoria.entidades.Conductor;

public interface IConductorService {
    Conductor crearConductor(Conductor conductor);

    Conductor consultarConductorPorId(Integer Id);

}
