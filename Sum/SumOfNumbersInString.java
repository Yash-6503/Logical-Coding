/*
 * Program to Find Total Sum of Numbers from given String.
*/

// package com.classes;

import java.util.Scanner;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) 
                sum += Character.getNumericValue(str.charAt(i));            
        }
        
        System.out.println("Total Sum of Numbers in String "+str+" is : "+sum);

        sc.close();
    }
}


/*
 * Output:
 * Enter a String :
 * java12345
 * Total Sum of Numbers in String java12345 is : 15
 * 
 * Enter a String :
 * hello@12345-6789
 * Total Sum of Numbers in String hello@12345-6789 is : 45
 * 
 * Enter a String :
 * Hello World!!
 * Total Sum of Numbers in String Hello World!! is : 0s
 */