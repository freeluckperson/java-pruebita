package com.erick;

import java.util.Scanner;

public class ConditionalStructure {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age");
        age = Enter.nextInt();
        if (age < 15) {
            System.out.println("Eres un niño");
        } else if (age < 18) {
            System.out.println("Eres un joven");
        } else {
            System.out.println("Con " + age + " de edad ya eres  adulto");
        }
    }

    ;
}
