/*
 * Program to Encrypt a Password given by user.
*/

// package com.classes;

import java.util.Scanner;

public class PasswordEncrypter {
    public static void main(String[] args) {
        try(
                Scanner sc = new Scanner(System.in);
        ) {

            System.out.println("Enter a Password : ");
            String password = sc.nextLine();
            StringBuilder encryptedPassword = new StringBuilder();
            int length = password.length();

            if (password.isBlank() || password.isEmpty()) {
                System.err.println("Please provide password...");
                return;
            }

            for (int i = 0; i < length; i++) {
                char ch = password.charAt(i);

                if (Character.isDigit(ch)) {
                    char newChar = (char) (ch+48);
                    encryptedPassword.append(newChar);
                } else if(Character.isLetter(ch)) {
                    if (ch == 'z') {
                        encryptedPassword.append('a');
                    } else if (ch == 'Z') {
                        encryptedPassword.append('A');
                    } else {
                        encryptedPassword.append((char) (ch + 1));
                    }
                } else {
                    encryptedPassword.append(ch);
                }
            }
            
            System.out.println("Original Password : "+password);
            System.out.println("Encrypted password : "+encryptedPassword);
        }
    }
}

/* Output:
 * Enter a Password :
 * ABC@123
 * Original Password : ABC@123
 * Encrypted password : BCD@abc
 * 
 * Enter a Password :
 * AbC@123
 * Original Password : AbC@123
 * Encrypted password : BcD@abc
 * 
 * Enter a Password :
 * 
 * Please provide password...
 * 
 * Enter a Password :
 * null
 * Original Password : null
 * Encrypted password : ovmm
*/