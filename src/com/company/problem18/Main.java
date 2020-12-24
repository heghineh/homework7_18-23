package com.company.problem18;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Design a class Product
// properties
// - title
// - price
// - rating
// Create 10 product objects in main,
// give them titles ,
// random prices in range (50$ - 100&)  ,
// and random ratings in range (0 - 10) and store them in an array (or ArrayList);
// get the best rated product from the array and display the title.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Product> products = new ArrayList<>();

        System.out.println("Enter the title of the product:");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + (i + 1) + "] ---> ");
            String title = scanner.nextLine();
            Product product = new Product(title, random.nextInt(101) + 50, random.nextInt(11));
            products.add(product);
        }
        System.out.println("\nThe list of all products:");

        for (int i = 0; i < 10; i++) {
            System.out.println("[" + (i + 1) + "]:  Title:  " + products.get(i).getTitle() + "  Price:  " +
                    products.get(i).getPrice() + "  Rating:  " + products.get(i).getRating());
        }
        System.out.println("\nThe best rated products:");

        for (int i = 0; i < 10; i++) {
            if (products.get(i).getRating() >= 8)
                System.out.println("[" + (i + 1) + "]:  Title:  " +
                        products.get(i).getTitle() + "  Rating:  " + products.get(i).getRating());
        }
    }
}