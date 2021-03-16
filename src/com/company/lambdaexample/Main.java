
package com.company.lambdaexample;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Cia nenaudojant Lambda
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Bethan");    

        //Cia naudojant Lambda:
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("Bethan");
        
        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };
        mp.printMessage();
        
       
    }
    
}