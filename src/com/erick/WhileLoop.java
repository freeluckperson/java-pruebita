package com.erick;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int nroTablaDeMultiplicar = 0;
        int nSecuencia = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indicar tabla de multiplicar: ");

        nroTablaDeMultiplicar = entrada.nextInt();

        while (nSecuencia <= 12) {
            System.out.println(nSecuencia + " X " + nroTablaDeMultiplicar + " = " + (nSecuencia * nroTablaDeMultiplicar));
            nSecuencia++;
        }
    }
}