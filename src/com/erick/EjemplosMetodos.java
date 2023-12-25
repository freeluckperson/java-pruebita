package com.erick;

public class EjemplosMetodos {

    static void Mensaje(String cNombre, int age) {
        System.out.println("Mi nombre es " + cNombre + " mi edad " + age);
    }

    static String Sumar(int tabla) {
        String result = "";
        for (int i = 0; i <= 10; i++) {
            result += tabla + " X " + i + " = " + tabla * i + "\n";
        }
        return result;
    }

    public static void main(String[] args) {

        Mensaje("Erick", 39);
        System.out.println(Sumar(2));

    }
}
