package com.erick;

public class ConditionalOp {
    public static void main(String[] args) {
        int num1;
        int num2;
        String name = "Erick";
        String lastName = "Segura";
        String result = name + " " + lastName;

        String response = "";
        num1 = 1;
        num2 = 2;
        response = (num1 < num2) ? "num2 es mayor que num1" : "num es mayor que num2";
        System.out.println(response);
        System.out.printf("My name is: %s", result);

    }
}
