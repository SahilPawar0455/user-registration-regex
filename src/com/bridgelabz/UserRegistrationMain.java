package com.bridgelabz;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();
        userRegistration.emailID();
        userRegistration.phoneNumber();
        userRegistration.password();
    }
}
