package DesignPattern.Adapter;

public class ICICIBankAdapter implements BankAPIAdapter {
    ICICIBank iciciBank;

    public ICICIBankAdapter(ICICIBank iciciBank) {
        this.iciciBank = iciciBank;
    }

    @Override
    public void addBankAccount(Bank bank) {
        iciciBank.addBankAccount(bank.getAccountNumber(), bank.getAccountHolderName());
    }

    @Override
    public boolean payment(String accountNumber, double amount) {
        return iciciBank.pay(amount, accountNumber);
    }

    @Override
    public double checkBalance(String accountNumber) {
        return iciciBank.checkBalance(accountNumber);
    }

    @Override
    public void transferFunds(String fromAccount, String toAccount, double amount) {
        iciciBank.transferFunds(fromAccount, toAccount, amount);
    }
}
