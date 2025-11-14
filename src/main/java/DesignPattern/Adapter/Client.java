package DesignPattern.Adapter;

public class Client {
    public static void main(String[] args) {
        YesBank yesBank = new YesBank();
        ICICIBank iciciBank = new ICICIBank();
        BankAPIAdapter bankAPIAdapter = new ICICIBankAdapter(iciciBank);
        PhonePe phonePe = new PhonePe(bankAPIAdapter);
    }
}
