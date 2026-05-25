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
        
        //part 2 code
        Messageclass1 mobj = new Messageclass1();
      int totalMessagesSent = 0;
      int choice = -1; // Initialized to a non-zero value so the loop starts

     while (choice != 0) {
     System.out.println("\nChoose an option:");
     System.out.println("1) Send Message");
     System.out.println("2) Show recently sent message");
     System.out.println("3) Quit");
    
     choice = scan.nextInt();
     scan.nextLine(); // 
    
     switch (choice) {
        
        case 1:
            System.out.println("Enter message: ");
            String message = scan.nextLine();
            
            System.out.println("\nOptions for your message:");
            System.out.println("1) Send Message");
            System.out.println("2) Disregard Message");
            System.out.println("3) Store Message to send later");
            System.out.print("Choose an option: ");
            
            int messageChoice = scan.nextInt();
            scan.nextLine(); // Clears buffer for sub-menu input
            
            switch (messageChoice) {
                case 1:
                    System.out.println("Message successfully sent");
                    totalMessagesSent++;
                    
                           System.out.println("Enter message: ");
    
     
        System.out.print("Enter recipient cell number: ");
        String recipient = scan.nextLine();
        
        
        long random10Digit = (long) (Math.random() * 9_000_000_000L) + 1_000_000_000L;
        String generatedId = String.valueOf(random10Digit);

     
        Messageclass1 msg = new Messageclass1();

        
        if (!msg.checkMessage()) {
            System.out.println("Please enter a message of less than 250 characters.");
            break;
        }
        
        if (!msg.checkRecipientCell()) {
            System.out.println("Error: Invalid recipient cellphone number.");
            break;
        }

        String calculatedHash = msg.createMessageHash();

       
        String transactionResult = msg.SentMessage();
        System.out.println(transactionResult);

        
        if (transactionResult.equals("Message successfully sent")) {
            totalMessagesSent++;
            
            System.out.println("\n-----------------------------------------");
            System.out.println("Message ID: " + generatedId);
            System.out.println("Message Hash: " + calculatedHash);
            System.out.println("Recipient: " + recipient);
            System.out.println("Message: " + message);
            System.out.println("-----------------------------------------");
                    break;
            }
            break; // Breaks out of main case 1

        case 2:
            System.out.println("Coming");
            break;

        case 3:
            System.out.println("Exiting program");
            choice = 0; // Setting choice to 0 terminates the while loop execution
            break;

        default:
            System.out.println("Invalid option, try again.");
            break;
            }//SWITCH
     }
     }//WHILE
    }//END OF METHOD
}//END OF CLAA             

             

    
        
                
    
 
     
        
        
    

