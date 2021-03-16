
package com.company.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bethan
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        // List of buildings
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);
        
        // List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        // List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);
        
        addHouseToList(houses);
        addHouseToList(buildings);
        
    }

    //? extends means what I can pass any type off object which extends Building
    //super types can be used when a subtype is specified
    // here is invariable used:
    static void printBuildings(List<? extends Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }
    
    // ? super specify the ype of list
    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
    // kad zn kada naudoti super ar extends... can think about invariables and outvariables
    
}
