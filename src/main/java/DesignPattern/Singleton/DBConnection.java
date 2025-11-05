package DesignPattern.Singleton;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/* Steps to create Singleton class
1. Make constructor private
2. Create Static method that returns the instance of the class
3. Static method checks if instance is null,
 if null create new instance else return existing instance
 */

public class DBConnection {
    private static DBConnection instance = null;

    String url;
    String username;
    String password;
    List<Connection> pool;

    private DBConnection () {
        // initialize the connection pool
        this.pool = new ArrayList<>();
    }

    public static DBConnection getInstance() {
        if(instance == null) {
            //LOCK
            instance = new DBConnection();
            //UNLOCK
        }
        return instance;
    }
}
