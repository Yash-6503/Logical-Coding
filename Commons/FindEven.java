/*
 * Program to check whether the given number is even or not.
*/

// package com.classes;

import java.util.Scanner;

public class FindEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {

            System.out.println("Enter a Number : ");
            int num = sc.nextInt();

            if (num < 0) {
                System.err.println("Please provide positive number.");
                return;
            }

            if (num % 2 == 0) {
                System.out.println(num+" is a Even Number.");
            } else {
                System.out.println(num+" is not a Even Number.");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


/* Output:
 * Enter a Number :
 * 10
 * 10 is a Even Number.
 * 
 * Enter a Number :
 * 5
 * 5 is not a Even Number.
 * 
 * Enter a Number :
 * -22
 * Please provide positive number.
*/