/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhoneBook_Java;

import java.util.Scanner;

/**
 *
 * @author Giang8692
 */
public class Phone {
    private String name;
    private String phoneNumber;

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = sc.nextLine();
    }

    public void hienthi() {
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}