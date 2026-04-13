/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationandlogin;

import java.util.Scanner;

public class RegistrationAndLogin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Registration
        System.out.println("Enter your Username");
        String username = scan.nextLine();

        System.out.println("Enter your first name");
        String name = scan.nextLine();

        System.out.println("Enter your password");
        String password = scan.nextLine();

        System.out.println("Enter your cellphone number (+27...)");
        String cellphonenumber = scan.nextLine();

        User user = new User(username, password, cellphonenumber);

        // Validate inputs
        boolean isUserValid = user.checkUsername();
        boolean isPasswordValid = user.checkPassword();
        boolean isCellValid = user.checkcellPhonenumber();

        System.out.println("Username valid: " + isUserValid);
        System.out.println("Cellphone valid: " + isCellValid);
        System.out.println("Password valid: " + isPasswordValid);

        // Login
        System.out.println("\n--- LOGIN ---");

        System.out.println("Enter username");
        String loginUsername = scan.nextLine();

        System.out.println("Enter password");
        String loginPassword = scan.nextLine();

        System.out.println("Enter cellphone number");
        String loginCell = scan.nextLine();

        //check actual login instead of re-checking validation
        boolean isLoggedIn = user.loginUser(loginUsername, loginPassword, loginCell);

        if (isLoggedIn) {
            System.out.println("Welcome, it is great to see you " + name);
        } else {
            System.out.println("Username or password or cellphone is incorrect, " + name);
        }
    }
}  
     
        
        
    

