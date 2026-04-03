/*
 * Program to Count number of Characters in a given String.
*/

// package com.classes;

import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (!Character.isDigit(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Total Number of Characters in "+str+" is : "+count);

        sc.close();
    }
}

/*
 * Output:
 * Enter a String :
 * Hello1234
 * Total Number of Characters in Hello1234 is : 5
 * 
 * Enter a String :
 * Hello@1234
 * Total Number of Characters in Hello@1234 is : 6
 * 
 * Enter a String :
 * 1234
 * Total Number of Characters in 1234 is : 0
 */