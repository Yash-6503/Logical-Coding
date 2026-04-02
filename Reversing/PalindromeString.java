/*
 * Program to Check whether the String is Palindrome or not.
*/

// package com.classes

import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        String originalString = str;

        //reverse a string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }


        if (originalString.equals(rev)) {
            System.out.println(originalString+" is a Palindrome");
        } else {
            System.out.println(originalString + " is not a Palindrome");
        }
        
        sc.close();
    }    
}


/* Output:
 * Enter a String :
 * madam
 * madam is a Palindrome
 * 
 * Enter a String :
 * java
 * java is not a Palindrome
 */