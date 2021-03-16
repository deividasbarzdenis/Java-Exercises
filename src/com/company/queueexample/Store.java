/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.queueexample;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author betha
 */
public class Store {
    
    public static void main(String[] args) {                
        
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);

    }
    // queues are useful if you are controlling access to shared resources.
    //Queues are a useful way of applying constraints in situations where you want the first item
    //in the queue to be the one that gets removed first.
    static void serveCustomer(LinkedList<Customer> queue) {
        
        Customer c = queue.poll();
        c.serve();
        
    }
    
}
