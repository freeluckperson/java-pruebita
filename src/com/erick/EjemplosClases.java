package com.erick;

class Persona {
    String name;
    int age;
    String phone;

    public String saludo(String cadena) {
        return "Hola que tal " + cadena;
    }
}

public class EjemplosClases {
    public static String edad(int miEdad) {
        return "Mi edad es " + miEdad;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.name = "Erick";
        persona1.age = 39;
        persona1.phone = "+584127882236";
        System.out.println(persona1.name);
        System.out.println(persona1.saludo(persona1.name));
        System.out.println(edad(persona1.age));
    }
}
