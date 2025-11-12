package DesignPattern.factory.example1;

public class MongoDBFactory implements DBFactory{
    @Override
    public NoSQLQuery createQuery() {
        return null;
    }
}
