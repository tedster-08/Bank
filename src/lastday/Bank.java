package lastday;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    public ArrayList<BankAccount> accounts = new ArrayList<>();
    private double interestRate = 0.05;

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccounts(new BankAccount(), new BankAccount(), new BankAccount());
        System.out.println(bank.accounts.get(0).getUUID());
        System.out.println(bank.getAccount(bank.accounts.get(0).getUUID()));

    }

    public void addAccounts(BankAccount... newAccounts) {
        accounts.addAll(Arrays.asList(newAccounts));
    }

    public BankAccount getAccount(String uuid) {
        BankAccount account = null;
        for (BankAccount i : accounts) {
            if (i.getUUID().equals(uuid)) account = i;
        }
        return account;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 1 && interestRate > 0) this.interestRate = interestRate;
        else System.out.println("Interest rate must be between 0 and 1!");
    }
}
