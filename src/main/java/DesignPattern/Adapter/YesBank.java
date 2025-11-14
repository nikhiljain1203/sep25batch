package DesignPattern.Adapter;

public class YesBank {
    void addAccount(Bank bank) {

    }

    boolean pay(String accountNumber, double amount) {
        return true;
    }

    double getBalance(Integer accountNumber) {
        return 0;
    }

    void transfer(String fromAccount, String toAccount, double amount) {

    }
}
