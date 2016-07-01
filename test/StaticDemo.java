/**
 * StaticDemo
 */
package com.planet.test;

/**
 * 
 * @author chuck
 *
 */
public class StaticDemo {

    public static final String value = "SD";

    {
    	// Block gets executed first when class instance is constructed
        System.out.println("HOLA");
    }

    static {
    	// All static blocks get executed first before class loads
        display();
    }

    public StaticDemo() {
        System.out.println("CONSTRUCTOR");
    }

    public static void display() {
        System.out.println("DATA");
    }

    public static void main(String[] args) {
        System.out.println("MAIN");

        new StaticDemo();
        new StaticDemo();
    }

    static {
    	// All static blocks get executed first before class loads
        System.out.println("STATIC BLOCK");
        System.out.println("StaticDemo.name = " + value);
    }
}

/*
DATA
STATIC BLOCK
StaticDemo.name = SD
MAIN
HOLA
CONSTRUCTOR
HOLA
CONSTRUCTOR
 */
