package lastday;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    public ArrayList<BankAccount> accounts = new ArrayList<>();
    private double interestRate = 0.05;

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccounts(new BankAccount(), new BankAccount(1.00), new BankAccount(20.50));
        for (BankAccount i : bank.accounts) System.out.println(i.getUUID());
        System.out.println('\n');
        for (BankAccount i : bank.accounts)  {
            System.out.println("balance = " + i.getCurrentBalance());
            i.applyInterest(bank.getInterestRate());
            System.out.println("balance after interest = " + i.getCurrentBalance());
            System.out.println("===");
        }

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
