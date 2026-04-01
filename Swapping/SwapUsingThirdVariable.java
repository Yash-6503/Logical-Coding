/*
 * Program to Swap 2 numbers using 3rd variable.
*/

// package com.classes;

public class SwapUsingThirdVariable {
    public static void main(String args[]) {
        int a = 10, b = 20;
        System.out.println("Before swaping a : " + a + ", b : " + b);
        
        //using 3rd variable
        int temp = a;   //temp = 10
        a = b;          //a = 20
        b = temp; //b = 10
        
        System.out.println("After swaping a : " + a + ", b : " + b);
    }
}

/* Output:
 * Before swaping a : 10, b : 20
 * After swaping a : 20, b : 10
 */