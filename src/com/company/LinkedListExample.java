
package com.company;

import java.util.LinkedList;

/**
 *
 * @author bethan
 */
public class LinkedListExample {
    
    
    public static void main(String[] args) {
        //is quick for remove and add items
        //labai panasus i Arraylist, bet jis yra patogesnis dirbant su daug elementu... ir jei as noriu
        //iterpti daug elementu i List viduri ir poto istrinti.
        //LinkedList naudoja daugiau atminties...ir visada geresnis pasirinkimas ArrayList.
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
        
    }

    
}
