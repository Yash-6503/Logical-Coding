/*
 * Program to Check whether the number is palindrome or not.
*/

// package com.classes;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.err.println("Please provide positive number.");
            sc.close();
            return;
        }

        //reverse the number
        int rev = 0, temp = num;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        //checking number is palindrome or not
        if (temp == rev) {
            System.out.println("Number "+temp+" is a Palindrome");
        } else {
            System.out.println("Number "+temp+" is not a Palindrome");
        }

        sc.close();
    }
}

/* Output:
 * Enter a Number :
 * 1234
 * Number 1234 is not a Palindrome
 * 
 * nter a Number :
 * 121
 * Number 121 is a Palindrome
 * 
 * Enter a Number :
 * -11
 * Please provide positive number.
 * 
 * Enter a Number :
 * 0
 * Number 0 is a Palindrome
*/