package com.erick;


import java.util.Scanner;

public class inputData {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        String name;
        String profession;
        int age;
        double salary;
        //Prepare the process
        System.out.println("Enter your name: ");
        name = Enter.nextLine();
        System.out.println("Enter your profession:");
        profession = Enter.nextLine();
        System.out.println("Enter your age: ");
        age = Enter.nextInt();
        System.out.println("Enter your salary");
        salary = Enter.nextDouble();
//        System.out.println("Hi " + name + " yours profession is " + profession + " your current age is " + age + " and salary " + salary);
        System.out.printf("Your name is %s, your profession is %s, your age is %s and salary is %s ", name, profession, age, salary);
    }
}
