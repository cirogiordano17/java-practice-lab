package com.ciro.practice.estructuras;

import java.util.ArrayList;
import java.util.Deque;

public class Listas {
    public static void main(String[] args) {

        // Declaracion y creacion

        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Añadir elementos
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        System.out.println(names);

        // Modificar
        System.out.println(names.set(2, "CC"));
        var a = names.clone();


        System.out.println(names.size());
        System.out.println(a);


        // Eliminar
        names.remove(3);
        System.out.println(names);

    }
}
