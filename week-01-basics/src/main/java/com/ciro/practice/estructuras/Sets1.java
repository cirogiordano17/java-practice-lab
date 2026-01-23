package com.ciro.practice.estructuras;

import java.util.HashSet;
import java.util.Set;

public class Sets1 {

    public static void main(String[] args) {


        // Declaracion
        Set<String> sets = new HashSet<>();

        // Agregar, LO HACE ORDENADO POR EL HASHCODE
        sets.add("B");
        sets.add("M");
        sets.add("a");
        sets.add("ac");
        sets.add("c");
        sets.remove("c");

        System.out.println(sets);
        System.out.println(sets.contains("ac"));



    }
}
