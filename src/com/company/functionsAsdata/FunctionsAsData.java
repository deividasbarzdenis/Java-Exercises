package com.company.functionsAsdata;

public class FunctionsAsData {
    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT = false;
        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
