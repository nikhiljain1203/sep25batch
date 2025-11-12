package DesignPattern.factory.example1;

public class Client {
    public static void main(String[] args) {
        DB db = new MYSQLDB();
        UserService userService = new UserService(db);
        userService.createUser();
    }
}
