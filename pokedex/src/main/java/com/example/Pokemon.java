package com.example;
//Integrantes del equipo:David Santiago Guerrero Tolosa y Jorge Alejandro López Paez
class Pokemon {
    String nombre;
    int codigo;

    public Pokemon(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
    }
}