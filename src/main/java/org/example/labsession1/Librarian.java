package org.example.labsession1;

public class Librarian extends User {
    private String employeeNumber;

    public Librarian() {
        super();
        this.employeeNumber = "0000";
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void incrementBorrowedBooks() {
        // NO OP
    }

    @Override
    public void decrementBorrowedBooks() {
        // NO OP
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public Librarian(Librarian other) {
        super(other);
        this.employeeNumber = other.getEmployeeNumber();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void addNewBook(Book book) {
        //
    }
    public void removeBook(Book book) {
        //
    }


}
