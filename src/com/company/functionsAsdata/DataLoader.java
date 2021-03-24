package com.company.functionsAsdata;

import com.company.biFunctions.NoArgFunction;

public class DataLoader {

    public final NoArgFunction<Person> loadPerson;

    public DataLoader(Boolean isDevelopment){
        this.loadPerson = isDevelopment
                ? this::loadPersonFake
                : this::loadPersonReal;
    }

    private Person loadPersonReal(){
        System.out.println("Loading person...");
        return new Person("Real Person", 30);
    }
    private Person loadPersonFake(){
        System.out.println("Returning fake person object...");
        return new Person("Fake Person", 100);

    }
}
