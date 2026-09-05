package com.colegiomagico.reto3;

/**
 * Usa un ciclo for para crear una cadena que repita la palabra 'Pocion ' la cantidad de veces indicada.
 */
public class PocionCiclos {

    public static String preparar(int cantidad) {
        String pociones = ""; 
        for (int i = 0; i < cantidad; i++) {
            pociones += "Pocion "; 
        }
        return pociones;
    }

    public static void main(String[] args) {
        System.out.println("Preparando 3 pociones: " + preparar(3));
    }
}
