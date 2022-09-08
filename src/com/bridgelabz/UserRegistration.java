package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
   Scanner scanner = new Scanner(System.in);
   User user = new User();
    public void firstName(){
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        boolean result = (Pattern.matches("[A-Z]{1,}[a-zA-z]{2,10}", firstName));
        if (result) {
            user.setFirstName(firstName);
        } else {
            System.out.println("Invalid Name please try again");
            firstName();
        }
    }
    public void lastName(){
        System.out.println("Enter the First Name");
        String lastName = scanner.next();
        boolean result = (Pattern.matches("[A-Z]{1,}[a-zA-z]{2,10}", lastName));
        if (result) {
            user.setLastName(lastName);
        } else {
            System.out.println("Invalid Name please try again");
            lastName();
        }
    }
    public void emailID(){
        System.out.println("Enter the Email ID");
        String emailID = scanner.next();
        boolean result = (Pattern.matches("^[a-zA-Z\\d+_.-]+@[a-zA-Z]+.[a-zA-z]{2,}", emailID));
        if(result){
            user.setEmail(emailID);
        }else {
            System.out.println("Invalid Last Name Please try Again");
            emailID();
        }
    }
}
