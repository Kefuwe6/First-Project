/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.specialproject;
import java.util.Scanner;


/**
 *
 * @author RC_Student_lab
 */
public class SpecialProject {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        // User registration
        System.out.println("Please enter the following details to register:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        // Register user
        String registrationMessage = Login.registerUser(username, password, firstName, lastName);
        System.out.println(registrationMessage);

        if (registrationMessage.startsWith("User registered successfully")) {
            // User login
            System.out.println("Please enter your details to login:");
            System.out.print("Username: ");
            String loginUsername = scanner.nextLine();
            System.out.print("Password: ");
            String loginPassword = scanner.nextLine();

            boolean loginSuccess = Login.loginUser(loginUsername, loginPassword, username, password);
            String loginStatus = Login.returnLoginStatus(loginSuccess, firstName, lastName);
            System.out.println(loginStatus);
 

}
    }
}


