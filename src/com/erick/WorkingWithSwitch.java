package com.erick;

import java.util.Scanner;

public class WorkingWithSwitch {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        System.out.println("Enter the number of day: ");
        int nDay = Enter.nextInt();

        String result = switch (nDay) {
            case 1 -> "Domingo";
            case 2 -> "Lunes";
            case 3 -> "Martes";
            case 4 -> "Miercoles";
            case 5 -> "Jueves";
            case 6 -> "Viernes";
            case 7 -> "Sabado";
            default -> "Nro. de dia ingresado no valido";
        };
        System.out.println(result);
    }
}
