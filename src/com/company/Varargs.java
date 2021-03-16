package com.company;

public class Varargs {
    public static void main(String[] args) {
        String imem1 = "Apples";
        String imem2 = "Oranges";
        String imem3 = "Pears";
        String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};

        printShoppingList(imem1, imem2, imem3);
        printShoppingList(shopping);
    }
    private static void printShoppingList(String... items){
        System.out.println("Shopping List:");
        for (int i = 0; i<items.length; i++){
            System.out.println(i+ 1 + ": " + items[i]);
        }
        System.out.println();
    }
}
