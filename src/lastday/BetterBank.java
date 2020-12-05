package lastday;

public class BetterBank extends Bank {

    public void deleteAccount(BankAccount account) {
        if (this.accounts.contains(account)) this.accounts.remove(account);
        else System.out.println("That account does not exist!");
    }
    public void deleteAccount(String uuid) {
        deleteAccount(this.getAccount(uuid));
    }

    public void applyInterestToAll(double rate) {
        for (BankAccount i : this.accounts) i.applyInterest(rate);
    }

}
