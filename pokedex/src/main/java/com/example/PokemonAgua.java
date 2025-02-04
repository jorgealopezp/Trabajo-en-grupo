package com.example;
//Integrantes del equipo:David Santiago Guerrero Tolosa y Jorge Alejandro López Paez
class PokemonAgua extends Pokemon {
    public PokemonAgua(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public void lanzarPistolaAgua() {
        System.out.println(nombre + " lanza Pistola Agua!");
    }
}