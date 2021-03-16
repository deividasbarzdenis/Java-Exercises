package com.company.methodreferencesexample;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Method references are a shorthand way of writing a certain type of lambda expression
        //if yuo have a lambda expression that passes in a variable and then calls a method on that
        //variable, you can replace it with a method reference.
        Square s = new Square(4);

        //Ne sutrumpintas lambda metodas
        Shapes shapes1 = (Square square) -> {
            return square.calculateArea();
        };

        //sutrumpintas naudojant method references:
        Shapes shapes = Square::calculateArea;

        System.out.println("Area: " + shapes.getArea(s));

    }

}
