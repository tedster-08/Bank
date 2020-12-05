package lastday;

import java.util.Random;

public class BankAccount {
    private double _currentBalance;
    private String _uuid;

    public BankAccount() {
        this._currentBalance = 0;
        this._uuid = generateUUID();
    }

    public static String generateUUID() {

        String uuid;
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) sb.append(r.nextInt(9));
            sb.append('-');
        }
        sb.deleteCharAt(sb.lastIndexOf("-"));

        uuid = sb.toString();

        return uuid;
    }

    public String getUUID() {
        return _uuid;
    }

    public double getCurrentBalance() {
        return _currentBalance;
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= _currentBalance) {
                _currentBalance -= amount;
            } else System.out.println("You can't withdraw more than you own. ");
        } else System.out.println("You cannot withdraw a negative amount, or zero. ");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            _currentBalance += amount;
        } else System.out.println("You cannot deposit zero, or a negative amount.");
    }

    public void applyInterest(double rate) {
        _currentBalance *= (1 + rate);
    }
}
