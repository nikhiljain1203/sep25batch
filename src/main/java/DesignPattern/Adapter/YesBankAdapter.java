package DesignPattern.Adapter;

public class YesBankAdapter implements BankAPIAdapter {
    private YesBank yesBank;

    public YesBankAdapter(YesBank yesBank) {
        this.yesBank = yesBank;
    }

    @Override
    public void addBankAccount(Bank bank) {
        yesBank.addAccount(bank);
    }

    @Override
    public boolean payment(String accountNumber, double amount) {
        return yesBank.pay(accountNumber, amount);
    }

    @Override
    public double checkBalance(String accountNumber) {
        return yesBank.getBalance(Integer.parseInt(accountNumber));
    }

    @Override
    public void transferFunds(String fromAccount, String toAccount, double amount) {
        yesBank.transfer(fromAccount, toAccount, amount);
    }
}
