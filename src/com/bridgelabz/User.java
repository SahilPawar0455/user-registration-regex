package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
    static Scanner scanner = new Scanner(System.in);
   private String firstName;


    public void setFirstName() {
        System.out.println("Enter the First Name");
        String name = scanner.next();
        boolean result = (Pattern.matches("[a-zA-z]{3,10}", name));
        if (result) {
            firstName = name;
        } else {
            System.out.println("Invalid Name please try again");
            setFirstName();
        }
    }
}
