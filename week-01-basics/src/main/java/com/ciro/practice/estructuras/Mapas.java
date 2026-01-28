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

        // Acceder
        System.out.println(names.get("Juan"));

        // Verificar elementos
        System.out.println(names.containsKey("Hector"));

        // Eliminar elementos
        System.out.println(names.remove("Maria"));
        System.out.println(names);

        // limpiar hashMap
        names.clear();
        System.out.println(names);

        // modificar elementos
        names.put("Juan", "Juan@Gmail.com");

        // Actualizar
        System.out.println(names.replace("A", "a")); // Reemplaza el valor si existe


        // Insertalo solo si no existe
        names.putIfAbsent("A", "aaa");
        System.out.println(names);

        System.out.println(names.values());

        var values = names.values();
        System.out.println(values);
    }
}
