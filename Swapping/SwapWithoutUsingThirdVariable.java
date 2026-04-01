/*
 * Program to Swap 2 numbers without using 3rd variable using different techniques.
*/

// package com.classes;

public class SwapWithoutUsingThirdVariable {
    public static void main(String args[]) {

        int a = 10, b = 20;
        System.out.println("Before swaping a : " + a + ", b : " + b);
        
        //Logic 1 : Add and Substraction
        a = a + b;      //10 + 20 = 30
        b = a - b;      //30 - 20 = 10
        a = a - b;      //30 - 10 = 20
        
        System.out.println("\nLogic 1 : Addition & Substraction \nAfter swaping a : " + a + ", b : " + b);
        
        //Logic 2 : Multiplication and Division
        a = 10;
        b = 20;
        
        a = a * b;      //10 * 20 = 200
        b = a / b;      //200 / 20 = 10
        a = a / b; //200 / 10 = 20
        
        System.out.println("\nLogic 2 : Multiplication & Division \nAfter swaping a : " + a + ", b : " + b);

        //Logic 3 : XOR operator
        a = 10;
        b = 20;
        
        a = a ^ b;      //10 ^ 20 = 30
        b = a ^ b;      //30 ^ 20 = 10
        a = a ^ b;      //30 ^ 10 = 20
        
        System.out.println("\nLogic 3 : XOR Operator \nAfter swaping a : " + a + ", b : " + b);
        
        //Logic 4 : Direct single statement
        a = 10;
        b = 20;
        
        b = a + b - (a = b); // execution will start from left to right
        //  10+20 = (30)        (20)
        // 30 - 20 = 10
        // b = 10, a = 20

        System.out.println("\nLogic 4 : Direct Single Statement \nAfter swaping a : " + a + ", b : " + b);
        
    }
}


/*
 * Output:
 * Before swaping a : 10, b : 20
 * 
 * Logic 1 : Addition & Substraction
 * After swaping a : 20, b : 10
 * 
 * Logic 2 : Multiplication & Division
 * After swaping a : 20, b : 10
 * 
 * Logic 3 : XOR Operator
 * After swaping a : 20, b : 10
 * 
 * Logic 4 : Direct Single Statement
 * After swaping a : 20, b : 10
 */