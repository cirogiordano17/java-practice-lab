package com.ciro.practice;

import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto

        String name = "Juan";
        String surname = " Gomez";

        // concatenacion

        System.out.println(name + surname);
        System.out.println(name.length());

        //Obtener caracter
        System.out.println(name.charAt(2));

        //substring

        System.out.println(name.substring(1));

        //mayus y minus

        System.out.println(name.toUpperCase());

        //contains

        System.out.println("Hola, Java".contains("ola"));
        System.out.println("Hola, Java".toLowerCase().contains("ava"));

        System.out.println(name.equals("Juan"));
        System.out.println(name.equals("juan"));
        System.out.println(name.equalsIgnoreCase("juan"));


        // == vs .equals

        var a = "Brais";
        var b = "Brais";
        var c = new String("Brais");


        System.out.println("Comparacion------------------");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        //equals compara contenido

        //trim

        System.out.println("     Hola, hello world   ".trim());
        System.out.println("     Hola, hello world   ");

        //replace

        System.out.println("     Hola, hello world   ".replace(" ", "."));
        System.out.println("     Hola, hello world   ".replace("world", "mundo"));

        //format
        var age = 26;
        System.out.println(String.format("Hola, %s. Tengo %d años", name, age));




    }
}
