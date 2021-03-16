/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.pathclassexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PathClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Path labai gerai patikrinti ar failas egzistuoja arba ji istrinti
        Path path = Paths.get("C:\\Users\\Deividas\\Documents\\Baigiamasis\\React\\Generics Exercises\\src\\com\\company\\pathclassexample\\Hello World.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException ex) {
           
        }
        //taip pat galima atspausdinti informacija paie faila naudojant Path klase
        Path path2 = Paths.get("C:\\Users\\Deividas\\Documents\\Baigiamasis\\React\\Generics Exercises\\src\\com\\company\\bufferedreaderexample\\example.txt");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
      
    }
    
}
