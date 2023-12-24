package com.erick;

import java.util.Scanner;

public class Vectores2 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int cantidadNotas;

        System.out.println("Ingrese la cantidad de calificaciones:");
        cantidadNotas = Entrada.nextInt();

        int[] notas = new int[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Ingresa la nota para la posicion " + i + " =");
            notas[i] = Entrada.nextInt();
        }
        System.out.println("Impresion de las notas ingresadas");
        for (int j = 0; j < cantidadNotas; j++) {
            System.out.println(notas[j]);
        }
    }
}
