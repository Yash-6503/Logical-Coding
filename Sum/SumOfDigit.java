/*
 * Program to Find Total Sum of Digits of given number.
*/
// package com.classes;

import java.util.Scanner;

import exception.NegativeInputException;
import exception.ZeroInputException;

public class SumOfDigit {
    public static void main(String[] args) {
        try(
                Scanner sc = new Scanner(System.in);
        ) {

            System.out.println("Enter a Number : ");
            int n = sc.nextInt();

            if(n == 0)
                throw new ZeroInputException("Please provide valid Input.");

            if(n < 0)
                throw new NegativeInputException("Please provide positive Input..");

            int temp = n;
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }

            System.out.println("Total Digit Sum of "+temp+" is : "+sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}

/* Output:
 * Enter a Number :
 * 12345 
 * Total Digit Sum of 12345 is : 15
 * 
 * 
 * Enter a Number :
 * 0
 * Please provide valid Input.
 * 
 * 
 * Enter a Number :
 * -2111
 * Please provide positive Input..
 * 
 * 
 * Enter a Number :
 * 1234567890
 * Total Digit Sum of 1234567890 is : 45
*/