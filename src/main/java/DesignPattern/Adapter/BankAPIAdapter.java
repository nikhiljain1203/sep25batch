package DesignPattern.Adapter;

public interface BankAPIAdapter {
    void addBankAccount(Bank bank);
    boolean payment(String accountNumber, double amount);
    double checkBalance(String accountNumber);
    void transferFunds(String fromAccount, String toAccount, double amount);
}
