package com.example;
//Integrantes del equipo:David Santiago Guerrero Tolosa y Jorge Alejandro López Paez
class PokemonFuego extends Pokemon {
    public PokemonFuego(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public void lanzarBrasas() {
        System.out.println(nombre + " lanza Brasas!");
    }
}