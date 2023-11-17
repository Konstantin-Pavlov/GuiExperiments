package PaymentMethodsTask;

public class Cash extends PaymentMethods {
    public Cash(int balance) {
        super(balance);
    }

    public boolean pay(double amount) {
        return amount <= super.getBalance();
    }
}
