package DesignPattern.factory.example1;

public class MySQLDBFactory implements DBFactory {
    @Override
    public SQLQuery createQuery() {
        return new SQLQuery();
    }
}
