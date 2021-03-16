/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.functionalinterfaceexample;

// functional Interface can have one method
@FunctionalInterface
public interface GreetingMessage {
    
    public abstract void greet(String name);  
    
    
}
