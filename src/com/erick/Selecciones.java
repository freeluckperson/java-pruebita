package com.erick;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Selecciones {
    // variable -> estado
    // comportamiento -> método
    // tipos de datos primitivos: int, byte, short, long, float, double, boolean, char
    String nombreEquipo;
    String grupo;
    Boolean clasificadoACuartos;

    void printTeam() {
        System.out.println(nombreEquipo);
        System.out.println(grupo);
        System.out.println(clasificadoACuartos);
    }

    public static void main(String[] args) {
        Selecciones argentina = new Selecciones();
        argentina.nombreEquipo = "Argentina";
        argentina.grupo = "C";
        argentina.clasificadoACuartos = true;
//        argentina.printTeam();

//        Conditionals
//        if (argentina.clasificadoACuartos == true) {
//            System.out.println("Si Son Classified");
//        } else if (argentina.clasificadoACuartos == false) {
//            System.out.println("We are bad");
//        }

//        Ternary Conditionals
        String message = argentina.clasificadoACuartos ? "SI clasifica" : "NO clasifico";
//        System.out.println(message);

//        Loops
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Asiento: " + i);
//        }


//        while loop
//        int i = 1;
//        while (i <= 10) {
//            System.out.println("Asiento: " + i);
//            i++;
//        }

//         Exception
//        int a = 0;
//        int b = 5;
//        try {
//            System.out.println(a / b);
//        } catch (Exception exception) {
//            System.out.println("Imposible dividir por 0");
//        }

//        API
        ArrayList<String> selecciones = new ArrayList<>();
        selecciones.add("Francia");
        selecciones.add("Inglaterra");
        selecciones.add("Brasil");
        selecciones.add("Marruecos");
//        System.out.println(selecciones);

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            array.add(i);
        }
        System.out.println(array);
    }
}

