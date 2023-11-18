package PaymentMethodsTask;

import java.math.BigDecimal;

public abstract class PaymentMethods {
    // ude BigDecimal instead of double
    private double balance;

    public PaymentMethods(int balance) {
        setBalance(balance);
    }

    public abstract boolean pay(double amount);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
