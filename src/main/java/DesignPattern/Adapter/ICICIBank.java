package DesignPattern.Adapter;

public class ICICIBank {
    void addBankAccount(String accountNumber, String accountHolderName) {
        // Implementation here
    }

    boolean pay(double amount, String accountNumber) {
        // Implementation here
        return true;
    }

    double checkBalance(String accountNumber) {
        // Implementation here
        return 0;
    }

    void transferFunds(String fromAccount, String toAccount, double amount) {
        // Implementation here
    }
}
