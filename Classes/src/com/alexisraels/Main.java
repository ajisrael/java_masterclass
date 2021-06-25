package com.alexisraels;

public class Main {

    // Objects have two key components: state and behavior
    // State are characteristics of the object:
    //      ex: a computer's states would be RAM, OS, Monitor Size, etc.
    //          a computer's behaviors would include booting up, shutting down, etc.
    // Software objects store their state in fields (variables) and expose behaviors with methods
    // Classes are just templates for objects
    // Encapsulation is a key attribute of OOP that keeps the internal workings of an object from public view.

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println(porsche.getModel());
    }
}
