package com.company.passingFunctionsAsArguments;

import com.company.TheFunctionInterface.MyMath;

public class MathMain {
    public static void main(String[] args) {
        System.out.println(Math.combine2And3(Math::add));
        System.out.println(Math.combine2And3(Math::substract));
        System.out.println(Math.combine2And3((x, y)-> 2 * x + 2 * y));
    }
}
