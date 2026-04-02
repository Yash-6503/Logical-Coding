/*
 * Program to Find Element in Array using Linear Search Algorithm.
*/

// package com.classes;

import java.util.*;

class NegativeInputException extends Exception {
    NegativeInputException(String message) {
        super(message);
    }
}


public class LinearSearch {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in);) {

            System.out.println("Enter how many elements you want to store : ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new NegativeInputException("Please provide a positive input.");
            }

            int arr[] = new int[n];
            System.out.println("\nEnter " + n + " elements in array : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("\nArray Elemets : " + Arrays.toString(arr));

            System.out.println("\nEnter a element to search : ");
            int key = sc.nextInt();
            int pos = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == key) {
                    pos = i + 1;
                    break;
                }
            }

            if (pos != 0) {
                System.out.println("\nElement Found at Position " + pos + " in Array.");
            } else {
                System.out.println("\nElement not Found in Array.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
}


/*
 * Output:
 * Enter how many elements you want to store :
 * 5
 * 
 * Enter 5 elements in array :
 * 10
 * 20
 * 30
 * 40
 * 50
 * 
 * Array Elemets : [10, 20, 30, 40, 50]
 * 
 * Enter a element to search :
 * 40
 * 
 * Element Found at Position 4 in Array.
 * 
 * Enter how many elements you want to store :
 * 5
 * 
 * Enter 5 elements in array :
 * 10
 * 20
 * 30
 * 40
 * 50
 * 
 * Array Elemets : [10, 20, 30, 40, 50]
 * 
 * Enter a element to search :
 * -10
 * 
 * Element not Found in Array.
 * 
 * Enter how many elements you want to store :
 * -10
 * Please provide a positive input.
 */