package PaymentMethodsTask;

public class Cash extends PaymentMethods {
    public Cash(int balance) {
        super(balance);
    }

    public boolean pay(double amount) {
        System.out.println("оплата наличными");
        return amount <= super.getBalance();
    }
}
