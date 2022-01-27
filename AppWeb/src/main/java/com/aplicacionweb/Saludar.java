package com.aplicacionweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {
    @Autowired
    private ManejadorMensaje manejadorMensaje;

    @GetMapping("/mensaje")
    public String saludar(@RequestParam String mensajeAGuardar){
        Mensaje mensaje= new Mensaje();
        mensaje.setMensaje(mensajeAGuardar);
        manejadorMensaje.save(mensaje);
        return mensajeAGuardar;
    }

    @GetMapping ("/sumar")
    public String sumar(@RequestParam int n1, @RequestParam int n2){
        int suma = n1 + n2;
        String respuesta = "la suma es : " + suma;
        return respuesta;
    }



}
