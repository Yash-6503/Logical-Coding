/*
 * Program to Find Total Sum of Array Elements.
*/

// package com.classes;

import java.util.*;

import exception.NegativeInputException;
import exception.ZeroInputException;



public class SumOfNumbersInArray {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in);) {

            System.out.println("Enter how many elements in array : ");
            int n = sc.nextInt();

            
            if (n < 0)
                throw new NegativeInputException("Please provide positive input..");
            
            if(n==0)
                throw new ZeroInputException("Array size cannot be Zero.");

            int arr[] = new int[n];

            System.out.println("\nEnter " + n + " elements : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("\nArray Elements : " + Arrays.toString(arr));

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            System.out.println("\nTotal sum of array elements is : " + sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


/* Output:
 * Enter how many elements in array :
 * 5
 * 
 * Enter 5 elements :
 * 10
 * 20
 * 30
 * 40
 * 50
 * 
 * Array Elements : [10, 20, 30, 40, 50]
 * 
 * Total sum of array elements is : 150
 * 
 * Enter how many elements in array :
 * -10
 * Please provide positive input..
 * 
 * 
 * Enter how many elements in array :
 * 0
 * Array size cannot be Zero.
 * 
 * 
 * Enter how many elements in array :
 * 002
 * 
 * Enter 2 elements :
 * 20
 * 80
 * 
 * Array Elements : [20, 80]
 * 
 * Total sum of array elements is : 100
*/