package com.company;

import java.util.Scanner;

public class NumerSum {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        printNumberList(enterNumbers(sc1));
        printStringList(enterStrings(sc1));
    }

    private static void printStringList(String... strings){
        System.out.println("String List:");
        for (int i = 0; i<strings.length; i++){
            System.out.println(i+ 1 + ": " + strings[i]);
        }
        System.out.println();
    }
    private static void printNumberList(int... number){
        System.out.println("Number List:");
        int num = 0;
        for (int j : number) {
            num += j;
            System.out.println(j);
        }
        System.out.println("Number sum: " + num);
        System.out.println();
    }

    private static int[] enterNumbers (Scanner sc){
        int[] arrayNumbers = new int[5];
        for(int i=0; i<arrayNumbers.length; i++){
            System.out.println("Enter a number: ");
            arrayNumbers[i] = sc.nextInt();
        }
        return arrayNumbers;
    }
    private static String[] enterStrings (Scanner sc){
        String[] arrayStrings = new String[5];
        for(int i=0; i<arrayStrings.length; i++){
            System.out.println("Enter a word: ");
            arrayStrings[i] = sc.next();
        }
        return arrayStrings;
    }
}
