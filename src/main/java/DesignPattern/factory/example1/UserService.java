package DesignPattern.factory.example1;

public class UserService {
    DB db;
    public UserService(DB db) {
        this.db = db;
    }

    public void createUser() {
        //logic to create user
        DBFactory factory = db.createFactory();
        Query q = factory.createQuery();
        q.execute();
    }

    public void deleteUser() {
        //logic to delete user
    }
}
