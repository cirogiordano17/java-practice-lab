package com.ciro.practice.loops;

public class ciclos {

    public static void main(String[] args) {

        // Loops

        int n = 3;

        for (int i = 1; i <= n; i++) {

            // espacios
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }



    }
}
