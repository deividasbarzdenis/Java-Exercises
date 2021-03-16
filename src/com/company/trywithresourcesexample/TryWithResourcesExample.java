/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.trywithresourcesexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        //Here is improved method by using try with resources. idedame i try(..[cia ideti]...) bet kas yra a resource.
        //Objects that implement the auto-closable interface are resources
        //del to, kad nebutu resource leaks.
        try(BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
                StringWriter writer = new StringWriter();) {
            
            
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        } catch (IOException ioe) {
            
        }

    }

}
