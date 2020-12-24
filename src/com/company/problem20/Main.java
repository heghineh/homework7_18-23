package com.company.problem20;

import java.util.ArrayList;

// Create  classes Book and Author
// Author
// -name(String)
// -surname (String)
// -gender ( String (or enum) -> MALE, FEMALE, OTHER )
// Book
// -title (String)
// -authors (array of type Author)
// -price (double)
// Create a Book in main with multiple Authors

public class Main {
    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Hitler", "Adolf", Gender.MALE));
        authors.add(new Author("Poghos", "Petrosyan", Gender.MALE));
        authors.add(new Author("Chgitem", "Chgitemyan", Gender.FEMALE));

        Book book = new Book("Blah", authors, 12000);
        System.out.println("The title of book: " + book.getTitle() + "\nPrice: " + book.getPrice() +
                "\nAuthors: ");

        for (int i = 0; i < 3; i++) {
            System.out.println(book.getAuthors().get(i).getName() +
                    " " + book.getAuthors().get(i).getSurname() +
                    " | " + book.getAuthors().get(i).getGender());
        }
    }
}