/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhoneBook_Java;

/**
 *
 * @author Giang8692
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice = 0;
        do {
            System.out.println("Phone Book");
            System.out.println("1. Add a name and phone number");
            System.out.println("2. Display all names and phone numbers");
            System.out.println("3. Search for a name");
            System.out.println("4. Remove a name and phone number");
            System.out.println("5. Change a phone number");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            try{
            
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {                
                case 1:
                  
                    String response;
                    do{
                        phoneBook.them();
                        do {
                        System.out.print("Do you want to add another number? (Y/N) ");
                        response = scanner.nextLine();
                    } while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N"));
                        if (!response.equalsIgnoreCase("Y")) {
                        break;
                    }
                    }while(response.equalsIgnoreCase("Y"));
                    break;              
  
                case 2:
                    phoneBook.hienthiA();
                    break;
                case 3:                               
                    String response1;                   
                    do {
                        System.out.print("Enter name to search: ");
                        String name = scanner.nextLine();
                        phoneBook.timKiem(name);
                        do {
                        System.out.print("Do you want to search for another name? (Y/N) ");
                        response1 = scanner.nextLine();
                        if (!response1.equalsIgnoreCase("Y") && !response1.equalsIgnoreCase("N")) {
                            System.out.println("Invalid input. Please try again.");
                        }
                        } while (!response1.equalsIgnoreCase("Y") && !response1.equalsIgnoreCase("N"));
                         if (!response1.equalsIgnoreCase("Y")) {
                         break;
                        }
                    
                        } while (response1.equalsIgnoreCase("Y"));
                        break;


                case 4:
                    String response2;                   
                    do {
                        System.out.print("Enter name to remove: ");
                        String name = scanner.nextLine();
                        phoneBook.xoa(name);
                        do {
                        System.out.print("Do you want to remove for another name? (Y/N) ");
                        response2 = scanner.nextLine();
                        if (!response2.equalsIgnoreCase("Y") && !response2.equalsIgnoreCase("N")) {
                            System.out.println("Invalid input. Please try again.");
                        }
                        } while (!response2.equalsIgnoreCase("Y") && !response2.equalsIgnoreCase("N"));
                         if (!response2.equalsIgnoreCase("Y")) {
                         break;
                        }
                        } while (response2.equalsIgnoreCase("Y"));
                        break;
                case 5:
                    String response3;                   
                    do {
                        System.out.print("Enter name you want to change phonenumber: ");
                        String name = scanner.nextLine();
                        phoneBook.sua(name);
                        do {
                        System.out.print("Do you want to change phonenumber for another name? (Y/N) ");
                        response3 = scanner.nextLine();
                        if (!response3.equalsIgnoreCase("Y") && !response3.equalsIgnoreCase("N")) {
                            System.out.println("Invalid input. Please try again.");
                        }
                        } while (!response3.equalsIgnoreCase("Y") && !response3.equalsIgnoreCase("N"));
                         if (!response3.equalsIgnoreCase("Y")) {
                         break;
                        }
                        } while (response3.equalsIgnoreCase("Y"));
                        break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
            } catch (Exception e) {
                scanner.nextLine();
                System.err.println("Input number from 1 to 6");
            }
        } while (choice != 6);
        scanner.close();
        
    }
}

