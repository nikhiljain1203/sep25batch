package org.example.labsession1;

public abstract class User {

    private static int TOTAL_USERS = 0;
    private static int ID_SEQUENCE = 0;
    private String userId;
    private String name;
    private String contactInfo;

    public User() {
        this.userId = generateUniqueId();
        this.name = "Not Assigned";
        this.contactInfo = "Not Assigned";
    }

    protected final String generateUniqueId() {
        //return "0";
        TOTAL_USERS++;
        return "U-" + ID_SEQUENCE++;
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User other) {
        this.userId = other.getUserId();
        this.name = other.getName();
        this.contactInfo = other.contactInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void incrementBorrowedBooks();

    public static int getTotalUsers() {
        return TOTAL_USERS;
    }

    public abstract void decrementBorrowedBooks();
}
