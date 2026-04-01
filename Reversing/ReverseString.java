/*
 * Program to Reverse a String using different techniques.
*/

// package com.classes;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String input = sc.nextLine();

        //Logic 1 : using Character Array way
        System.out.println("\nLogic 1 : Using Character Array way");
        char ch[] = input.toCharArray();
        System.out.print("Reverse of "+input+" is ");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + "");
        }
        
        //Logic 2 : Using StringBuffer Class
        System.out.println("\n\nLogic 2 : Using StringBuffer Class");
        StringBuffer sb = new StringBuffer(input);
        System.out.println("Reverse of " + input + " is " + sb.reverse());
        
        //Logic 3 : Using StringBuilder Class
        System.out.println("\nLogic 3 : Using StringBuilder Class");
        StringBuilder builder = new StringBuilder(input);
        System.out.println("Reverse of " + input + " is " + builder.reverse());
        
        //Logic 4 : Using Loop Traditional way
        System.out.println("\nLogic 4 : using Loop traditional way");
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }
        System.out.println("Reverse of " + input + " is " + rev);
        
        sc.close();
    }
}

/* Output:
 * Enter a String :
 * java
 * 
 * Logic 1 : Using Character Array way
 * Reverse of java is avaj
 * 
 * Logic 2 : Using StringBuffer Class
 * Reverse of java is avaj
 * 
 * Logic 3 : Using StringBuilder Class
 * Reverse of java is avaj
 * 
 * Logic 4 : using Loop traditional way
 * Reverse of java is avaj
*/