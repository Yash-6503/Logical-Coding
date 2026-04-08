/*
 * Program to Compress the give number
 * for ex.468 -> 234 
 * make each digit half of it.
 */
// package com.classes;

import java.util.Scanner;

public class NumberCompressor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.err.println("Please provide positive number.");
                return;
            }

            int temp = num;
            int compress = 0;

            while (num != 0) {
                compress = compress * 10 + ((num % 10) / 2);
                num /= 10;
            }
            
            int n = compress;
            int comp = 0;
            while (n != 0) {
                comp = comp * 10 + ((n % 10));
                n /= 10;
            }

            if (comp > 0) {
                System.out.println("Compressed of "+temp+" is : "+comp);
            } else {
                System.out.println("Number "+temp+" cannot be compressed..");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
}

/*
 * Output:
 * Enter a Number:
 * 486
 * Compressed of 486 is : 243
 * 
 * Enter a Number:
 * -44387
 * Please provide positive number.
 * 
 * NumberCompressor.java
 * Enter a Number:
 * 8952
 * Compressed of 8952 is : 4421
 * 
 * Enter a Number:
 * 1010
 * Number 1010 cannot be compressed..
 */