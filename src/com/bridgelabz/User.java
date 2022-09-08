package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
   private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
