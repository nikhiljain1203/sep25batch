package solid.di;

public class Client {
    public static void main(String[] args) {
        A a = new A(new DynamoConnection(), new C());
    }
}
