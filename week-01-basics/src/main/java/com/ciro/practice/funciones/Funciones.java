package com.ciro.practice.funciones;

public class Funciones {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i ++){
            sendEmail();
            sendEmailToUser(String.valueOf(i));
        }

    }

    public static void sendEmail(){
        System.out.println("Se envio el Mail...");
    }

    public static void sendEmailToUser(String email){

        System.out.printf("se ha enviado el mail a %s%n", email);

    }
}
