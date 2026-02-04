package com.ciro.practice.oop;

public class Person {

    //Atributos
    String name;
    int age;

    // Constructores
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){};


    //Metodos
    public void saludar(){
        System.out.printf("Me llamo %s, y tengo %s años", name, age);
    }
}
