package com.example.tutoria.service.impl;

import com.example.tutoria.entidades.Conductor;
import com.example.tutoria.repository.IConductorRepository;
import com.example.tutoria.service.IConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConductorServiceImpl implements IConductorService {

    /* Esta interfase contiene los metodos para conectarse a la bd.
    y lo que esta almacenado la variable "iConductorRepository" es un objeto que implementa la
    interfase "IConductorRepository". En esta caso Spring Boot ya se va encargar de proveer este objeto e
    insertalo aqui.
     */
    @Autowired // Si no existe esta ANOTACION la variable "iConductorRepository" va ser NULO.
    IConductorRepository iConductorRepository;

    @Override
    public Conductor crearConductor(Conductor conductor) {
        // Me puedo comunicar con un API para validar por ejemplo un correo electronico, un documento de indentidad, etc.
        // Puedo verificar un nombre
        // Puedo verificar un apellido
        if(conductor.getApellido() == null && conductor.getApellido() == null){
            return null;
        } else {
            Conductor conductorGuardado = iConductorRepository.save(conductor);
            return conductorGuardado;
        }
    }

    @Override
    public Conductor consultarConductorPorId(Integer Id) {
        Optional<Conductor> optionalConductor = iConductorRepository.findById(Id);
        if(optionalConductor.isPresent()){
            return optionalConductor.get();
        } else {
            return null;
        }
    }
}
