package com.company.bufferedreaderexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {


        File myFile = new File("src/com/company/bufferedreaderexample/example.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            
        }
        
    }

}
