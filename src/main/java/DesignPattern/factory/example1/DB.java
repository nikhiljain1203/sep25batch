package DesignPattern.factory.example1;

public interface DB {
    void connect();
    int getVersion();
    DBFactory createFactory();
}
