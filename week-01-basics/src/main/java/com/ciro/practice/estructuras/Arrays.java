package com.ciro.practice.estructuras;

public class Arrays {

    public static void main(String[] args) {

        // declaracion y creacion
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"brais", "a", "b", "dev"}; //es el puntero
        System.out.println(names);

        // Acceso
        System.out.println(numbers[0]);
        System.out.println(names[0]);
        System.out.println(java.util.Arrays.toString(numbers));

        // Modificar
        numbers[0] = 1;
        names[2] = null;

        System.out.println(java.util.Arrays.toString(names));




    }
}

