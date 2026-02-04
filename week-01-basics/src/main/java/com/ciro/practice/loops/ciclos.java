package com.ciro.practice.loops;

import java.util.HashMap;
import java.util.HashSet;

public class ciclos {

    public static void main(String[] args) {

        // Loops

        for (int i = 0; i <=5 ; i++){
            System.out.println("Hola Java");
        }

        // For-Each

        String[] names = {"a", "aaaabbb", "avava", "alooo"};

        for (String name : names ){
            System.out.println(name);
        }

        HashMap<String, String> users = new HashMap<>();
        users.put("Juan", "juan@gmail.com");
        users.put("Martin", "martin@gmail.com");
        users.put("Carlos", "carlos@gmail.com");
        users.put("Juanete", "juanete@gmail.com");

        for (HashMap.Entry<String, String> email : users.entrySet()){
            System.out.printf("El mail de %s es %s%n", email.getKey(), email.getValue());
        }
        // System.out.println(users.entrySet());


        // while

        int i = 0;
        while (i < names.length){
            System.out.println(names[i]);
            if (names[i].equals("a")){
                i +=2;
            }
            i++;
        }

        //do-while
        int in = 0;
        do {
            System.out.println("a1");
            i++;
        }while (in <0);

        // Control de bucles

        // break
        for (String name : names ){
            if (name.equals("avava")) {
                break;
            }
            System.out.println(name);
        }

        // continue
        for (int ind = 0; ind < 5; ind++){
            if (ind == 3){
                continue;
            }
            System.out.println(ind);

        }


    }
}
