package com.generation;

import java.util.Scanner; //Se importó la clase Scanner para poder leer la entrada del usuario.

public class Codigo4 {
    public static void main(String[] args) {  // Se creó un método main para que el programa tenga un punto de entrada válido.
        Scanner s = new Scanner(System.in); // se debe pasar System.in al constructor de Scanner

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // se cambió de j1 a j2
        String j2 = s.nextLine(); // se debe usar el mismo objeto Scanner creado antes

        if (j1.equals(j2)) { // se cambió == por equals para comparar cadenas de texto
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { // se cambió == por equals
                        g = 1;
                    }
                    break; // se debe poner un break después de cada caso

                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;

                case "tijeras": // se corrigió la ortografía de "tijeras"
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;

                default:
                    break;
            }
            System.out.println("Gana el jugador " + g);
        }

        s.close(); // se cierra el objeto Scanner
    }
}