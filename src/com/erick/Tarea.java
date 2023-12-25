package com.erick;

import com.erick.EjemplosClases;

public class Tarea {
    public static void main(String[] args) {
        Persona oPers1 = new Persona();
        oPers1.name="Erick";
        oPers1.age=39;
        oPers1.phone="+584127882236";

        System.out.println(oPers1.saludo(oPers1.name));
    }
}
