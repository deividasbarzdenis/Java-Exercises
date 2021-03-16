/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.directoriesexample;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };
   
        
        String[] contents = new File(".").list(filter);
        for(String file: contents) {
            System.out.println(file);
        }
        new File("C:\\Users\\Deividas\\Documents\\Baigiamasis\\React\\Generics Exercises\\src\\com\\company\\directoriesexample\\myDirectory")
                .mkdir();
        
    }
    
}
