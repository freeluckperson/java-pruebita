package com.erick;

public class Variables {
    public static void main(String[] args) {
        String name = "Erick";
        int age = 39;
        double salary = 1555.35;
        boolean single = false;
        int num1;
        int num2;
        int result;
        num1 = 1;
        num2 = 2;
        result = num1 - num2;
        System.out.println(result);
//        System.out.println("My name is: " + name + " and my age is: " + age);
        System.out.printf("My name is: %s, my age is: %d, my salary is: %f, I am single: %b", name, age, salary, single);
    }
}
