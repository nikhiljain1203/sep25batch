package DesignPattern.Singleton;

public class Client {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();

        System.out.println("Debug");
    }
}
