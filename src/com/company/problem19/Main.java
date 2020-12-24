package com.company.problem19;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Design a class User
// properties
// - username
// - password
// - role ( String(or enum) -> ADMIN, CUSTOMER)
// Password should contain at least one uppercase character at least 3 numbers and at least one
// special character (“#”, “!”, or “%”) . If password is not valid, do not set it to user
// Create 10 users in main,
// 2 administrators and 8 customers
// Store them in an array (or ArrayList)

public class Main {
    static String password;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter the username:  ");
            String username = scanner.nextLine();
            System.out.print("Enter the password:  ");
            password = getPasswordFromConsole();

            if (isValid(password)) {
                System.out.print("Enter the role (ADMIN or CUSTOMER):  ");
                String role1 = scanner.nextLine();
                Role role = Role.valueOf(role1);

                User user = new User(username, password, role);
                users.add(user);

            } else {
                System.out.print("Enter the role:  (ADMIN or CUSTOMER):  ");
                String role1 = scanner.nextLine();
                Role role = Role.valueOf(role1);

                User user = new User(username, role);
                users.add(user);
            }
            System.out.println();
        }

        System.out.println("Users list:");
        for (int i = 0; i < 10; i++) {
            if (users.get(i).getPassword() == null)
                System.out.println("Username:  " + users.get(i).getUsername() +
                        "  Role:  " + users.get(i).getRole());
            else
                System.out.println("Username:  " + users.get(i).getUsername() + "  Password:  " +
                        users.get(i).getPassword() + "  Role:  " + users.get(i).getRole());
        }
    }

    //region Conditions for password
    public static boolean checkUppercaseNumber(String password) {
        String uppercase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < uppercase.length(); j++) {
                if (String.valueOf(password.charAt(i)).equals(String.valueOf(uppercase.charAt(j)))) {
                    counter++;
                    break;
                }
            }
        }
        return counter >= 1;
    }

    public static boolean checkDigitsNumber(String password) {
        String digits = "1234567890";
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < digits.length(); j++) {
                if (String.valueOf(password.charAt(i)).equals(String.valueOf(digits.charAt(j)))) {
                    counter++;
                    break;
                }
            }
        }
        return counter >= 3;
    }

    public static boolean checkSpecialCharacterNumber(String password) {
        String character = "#!%";
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < character.length(); j++) {
                if (String.valueOf(password.charAt(i)).equals(String.valueOf(character.charAt(j)))) {
                    counter++;
                    break;
                }
            }
        }
        return counter >= 1;
    }

    public static boolean isValid(String password) {
        return checkSpecialCharacterNumber(Main.password) &&
                checkUppercaseNumber(Main.password) &&
                checkDigitsNumber(Main.password);
    }
    //endregion

    public static String getPasswordFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String printPassword(String password) {
        return password;
    }
}