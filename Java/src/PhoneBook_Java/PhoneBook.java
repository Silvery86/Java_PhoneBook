/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhoneBook_Java;

/**
 *
 * @author Giang8692
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<Phone> danhba;

    public PhoneBook() {
        danhba = new ArrayList<Phone>();
    }

    public void them() {
        Phone phone = new Phone("", "");
        phone.nhap();
        boolean flag = false;
        for (int i = 0; i < danhba.size(); i++) {
            if (danhba.get(i).getPhoneNumber().equals(phone.getPhoneNumber())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            danhba.add(phone);
            System.out.println("The phone number has been added to the phone book.");
        } else {
            System.out.println("The phone number is already in the phone book.");
        }
    }

    public void hienthiA() {
        for (int i = 0; i < danhba.size(); i++) {
            System.out.println("Name: " + danhba.get(i).getName());
            System.out.println("Phone number: " + danhba.get(i).getPhoneNumber());
            System.out.println();
        }
    }

    public void timKiem(String name) {
        boolean flag = false;
        for (int i = 0; i < danhba.size(); i++) {
            if (danhba.get(i).getName().equals(name)) {
                System.out.println("Name: " + danhba.get(i).getName());
                System.out.println("Phone number: " + danhba.get(i).getPhoneNumber());
                System.out.println();
                flag = true;
            }
        }
        if (!flag)
            System.out.println("The name " + name + " was not found in the phone book.");
    }

    public void xoa(String name) {
        boolean flag = false;
        for (int i = 0; i < danhba.size(); i++) {
            if (danhba.get(i).getName().equals(name)) {
                danhba.remove(i);
                System.out.println("The name and phone number have been removed from the phone book.");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("The name " + name + " was not found in the phone book.");
        }
    }

    public void sua(String name) {
        boolean flag = false;
        for (int i = 0; i < danhba.size(); i++) {
            if (danhba.get(i).getName().equals(name)) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the new phone number: ");
                String newPhoneNumber = scanner.nextLine();
                danhba.get(i).setPhoneNumber(newPhoneNumber);
                System.out.println("The phone number has been updated.");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("The name " + name + " was not found in the phone book.");
        }
    }
}

