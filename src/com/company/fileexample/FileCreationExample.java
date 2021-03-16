
package com.company.fileexample;

import java.io.File;
import java.io.IOException;


public class FileCreationExample {

    public static void main(String[] args) {
        
        File myFile = new File("C:\\Users\\Deividas\\Documents\\Baigiamasis\\React\\Generics Exercises\\src\\com\\company\\fileexample\\myFile.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException ioe) {
            
        }

    }
    
}