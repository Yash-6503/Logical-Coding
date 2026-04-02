/*
 * Program to Count Total number of Digits from a given number.
*/

// package com.classes;

import java.util.*;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        long num = sc.nextInt();

        if (num < 0) {
            System.err.println("Please provide positive number.");
            sc.close();
            return;
        }

        long temp = num;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }

        System.out.println("Total Number of Digits in "+temp+" is : "+count);

        sc.close();
    }
}


/* Output:
 * Enter a Number :
 * 1234
 * Total Number of Digits in 1234 is : 4
 * 
 * Enter a Number :
 * 1122334455
 * Total Number of Digits in 1122334455 is : 10
 * 
 * Enter a Number :
 * -112
 * Please provide positive number.
 */