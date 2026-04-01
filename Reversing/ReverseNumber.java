/*
 * Program to Reverse a number using different techniques.
*/
// package com.classes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        // Logic 1 : using while loop and aplying formula
        System.out.println("\nLogic 1 : using while loop and aplying formula");
        int rev = 0, lastDigit = 0, temp = num;
        while (num != 0) {
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        System.out.println("Reverse of " + temp + " is " + rev);

        //Logic 2 : Using StringBuffer class
        System.out.println("\nLogic 2 : Using StringBuffer Class");
        StringBuffer reverse;
        StringBuffer sb = new StringBuffer(String.valueOf(temp));
        reverse = sb.reverse();
        System.out.println("Reverse of " + temp + " is " + reverse);
        
        //Logic 3 : Using StringBuilder Class
        System.out.println("\nLogic 3 : Using StringBuilder Class");
        StringBuilder revNum;
        StringBuilder builder = new StringBuilder(String.valueOf(temp));
        revNum = builder.reverse();
        System.out.println("Reverse of " + temp + " is " + revNum);

        sc.close();
    }    
}


/* Output:
 * Enter a Number :
 * 1234
 * 
 * Logic 1 : using while loop and aplying formula
 * Reverse of 1234 is 4321
 * 
 * Logic 2 : Using StringBuffer Class
 * Reverse of 1234 is 4321
 * 
 * Logic 3 : Using StringBuilder Class
 * Reverse of 1234 is 4321
*/