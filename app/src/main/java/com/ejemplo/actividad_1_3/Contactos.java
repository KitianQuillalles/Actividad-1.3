package com.ejemplo.actividad_1_3;

public class Contactos {
    private String nombre;
    private String numero;
    private String correo;

    public Contactos(String nombre, String numero, String correo){
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getCorreo() {
        return correo;
    }
}
