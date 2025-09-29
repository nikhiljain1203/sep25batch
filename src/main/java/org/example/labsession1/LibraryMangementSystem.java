package org.example.labsession1;

import java.util.List;

public class LibraryMangementSystem {
    private static List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryMangementSystem() {
        this.bookInventory = new java.util.ArrayList<>();
        this.registeredUsers = new java.util.ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public static List<Book> searchBooks(String criteria) {
        // Dummy implementation
        List<Book> results = new java.util.ArrayList<>();

        for(Book b: bookInventory) {
            String title = b.getTitle();
            String author = b.getAuthor();

            if(title != null && title.equals(criteria)) {
                results.add(b);
            } else if(author != null && author.equals(criteria)) {
                results.add(b);
            }
        }
        return results;
    }
}
