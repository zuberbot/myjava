package com.java.poly;

/**
 *
 * @author chuck
 */
public class FindAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {

        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(10, 8);
        Triangle t = new Triangle(10, 8);
        
        Figure figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());
    }

}
