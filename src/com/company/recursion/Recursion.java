package com.company.recursion;

public class Recursion {
    // in recursion, it is important to say for function then to stop
    // recursive function example:
    public static void countDown(Integer x, Integer end){
        //shoot it done the function
        if(x < end){
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countDown(x-1, end);
    }

    public static void countUp(Integer x, Integer end){
        if (x > end){
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countUp(x + 1, end);
    }
    public static void main(String[] args) {
        countDown(10, 0);
        countUp(0, 10);
    }
}
