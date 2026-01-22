package com.ciro.practice;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        //condicionales
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresá tu edad: ");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Error: no ingresaste una edad");
            return;
        }

        int edad;
        try {
            edad = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: la edad debe ser un número entero");
            return;
        }

        if (edad < 0) {
            System.out.println("Error: la edad no puede ser negativa");
            return;
        }

        if (edad >= 18) {
            System.out.println("Sos mayor de edad");
        } else {
            System.out.println("Sos menor de edad");
        }

        //switch
        var day = 5;
        String dia = switch (day) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println(dia);


    }

}
