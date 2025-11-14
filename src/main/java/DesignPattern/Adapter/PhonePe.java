package DesignPattern.Adapter;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(BankAPIAdapter bankAPIAdapter) {
        this.bankAPIAdapter = bankAPIAdapter;
    }

    void payment(String accountNumber, double amount) {
        boolean status = bankAPIAdapter.payment(accountNumber, amount);
        if (status) {
            System.out.println("Payment of " + amount + " from account " + accountNumber + " successful via PhonePe.");
        } else {
            System.out.println("Payment of " + amount + " from account " + accountNumber + " failed via PhonePe.");
        }
    }
}
