package org.example.labsession2.question3;

public class DepositTask implements Runnable{
    private BankAccount bankAccount;

    public DepositTask(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            bankAccount.deposit(i);
        }
    }
}
