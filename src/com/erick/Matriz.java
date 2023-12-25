package com.erick;

public class Matriz {
    public static void main(String[] args) {
        String[][] Personas = new String[3][3];

        Personas[0][0] = "Erick";
        Personas[0][1] = "Segura";
        Personas[0][2] = "Cabello";


        Personas[1][0] = "Isaac";
        Personas[1][1] = "Segura";
        Personas[1][2] = "Torrealba";

        Personas[2][0] = "Noel";
        Personas[2][1] = "Petro";
        Personas[2][2] = "Figueroa";

        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                System.out.println(Personas[j][i]);
            }
            System.out.println("-------------");
        }
    }
}
