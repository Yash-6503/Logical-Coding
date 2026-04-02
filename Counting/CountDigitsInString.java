/*
 * Program to Count Total number of Digits from a given String.
*/

// package com.classes;

import java.util.*;

public class CountDigitsInString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Total Number of digits in "+str+" is : "+count);
        
        sc.close();
    }
}

/* Output:
 * Enter a String :
 * abc123xyz456
 * Total Number of digits in abc123xyz456 is : 6
 * 
 * Enter a String :
 * ab-12
 * Total Number of digits in ab-12 is : 2
 * 
 * Enter a String :
 * abcd
 * Total Number of digits in abcd is : 0
 */