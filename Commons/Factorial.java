/*
 * Program to find Factorial of given number.
*/

// package com.classes;

import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {

            System.out.println("Enter a number : ");
            int n = sc.nextInt();

            if (n < 0) {
                System.err.println("Please provide positive number..");
                return;
            }

            int temp=n;
            int fact = 1;
            while (n > 0) {
                fact *= n;
                n--;
            }

            System.out.println("Factorial of "+temp+" is : "+fact);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

/* Output:
 * Enter a number :
 * 5
 * Factorial of 5 is : 120
 * 
 * Enter a number :
 * 4
 * Factorial of 4 is : 24
 * 
 * Enter a number :
 * -10
 * Please provide positive number..
*/