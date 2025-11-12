package DesignPattern.factory.example1;

public class MongoDB implements DB{
    @Override
    public void connect() {

    }

    @Override
    public int getVersion() {
        return 0;
    }

    @Override
    public DBFactory createFactory() {
        return new MongoDBFactory();
    }
}
