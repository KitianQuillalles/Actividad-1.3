package com.ejemplo.actividad_1_3;

public class Contactos {
    private int imagen;
    private String nombre;
    private String numero;
    private String correo;

    public Contactos(int imagen, String nombre, String numero, String correo){
        this.imagen = imagen;
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    public int getImagen() {
        return imagen;
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
