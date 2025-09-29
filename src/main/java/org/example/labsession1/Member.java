package org.example.labsession1;

public class Member extends User {
    private static final int MAX_BORROW_LIMIT = 5;
    private int borrowedBooksCount;

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    public Member(Member other) {
        super(other);
        this.borrowedBooksCount = other.getBorrowedBooksCount();
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    public void incrementBorrowedBooks() {
        if (canBorrowBooks()) {
            borrowedBooksCount++;
        } else {
            System.out.println("Cannot borrow more books. Limit reached.");
        }
    }

    public void decrementBorrowedBooks() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--;
        } else {
            System.out.println("No borrowed books to return.");
        }
    }
}
