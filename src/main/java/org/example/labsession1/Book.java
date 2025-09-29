package org.example.labsession1;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    // We should not allow setting availability directly
//    public void setAvailable(boolean available) {
//        isAvailable = available;
//    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            user.incrementBorrowedBooks();
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        user.decrementBorrowedBooks();
        isAvailable = true;
    }

    abstract void displayBookDetails();
}
