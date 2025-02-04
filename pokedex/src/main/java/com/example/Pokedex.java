package com.example;

import java.util.Scanner;
//Integrantes del equipo:David Santiago Guerrero Tolosa y Jorge Alejandro López Paez

public class Pokedex {
    public static void main(String[] args) {

        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 25);
        PokemonFuego charmander = new PokemonFuego("Charmander", 4);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 1);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 7);

        System.out.println("Bienvenido a la Pokedex!");
        System.out.println();
        System.out.println("De que pokemon deseas saber más?");
        System.out.println("1. Pikachu\n2. Charmander\n3. Bulbasaur\n4. Squirtle");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                pikachu.mostrarInfo();
                pikachu.lanzarAtactrueno();
                break;
            case 2:
                charmander.mostrarInfo();
                charmander.lanzarBrasas();
                break;
            case 3:
                bulbasaur.mostrarInfo();
                bulbasaur.lanzarLatigoCepa();
                break;
            case 4:
                squirtle.mostrarInfo();
                squirtle.lanzarPistolaAgua();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}