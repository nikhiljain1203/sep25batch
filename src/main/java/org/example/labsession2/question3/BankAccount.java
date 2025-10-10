package org.example.labsession2.question3;

public class BankAccount {
    private Long balance = 0L;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        synchronized (this) {
            if (amount > 0) {
                this.balance += amount;
            }
        }
    }

    public void withdraw(int amount) {
        /// /
        synchronized (this) {
            if(this.balance >= amount && amount > 0) {
                this.balance -= amount;
            }
        }
        /// /
    }
}
