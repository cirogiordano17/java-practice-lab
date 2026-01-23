package com.ciro.practice.estructuras;

import java.util.HashMap;

public class Mapas {

    public static void main(String[] args) {

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();


        // Tamaño
        System.out.println(names.size());

        // Agregar elementos
        names.put("Juan", "Juan@Gmail.com");
        names.put("Maria", "Maria@Gmail.com");
        names.put("Hector", "Hector@Gmail.com");


        // Mostrar
        System.out.println(names);
    }
}
