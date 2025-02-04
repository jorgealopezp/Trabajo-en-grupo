package com.example;
//Integrantes del equipo:David Santiago Guerrero Tolosa y Jorge Alejandro López Paez
class PokemonPlanta extends Pokemon {
    public PokemonPlanta(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public void lanzarLatigoCepa() {
        System.out.println(nombre + " lanza Latigo Cepa!");
    }
}