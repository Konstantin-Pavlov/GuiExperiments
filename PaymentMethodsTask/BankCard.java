package PaymentMethodsTask;

public class BankCard extends PaymentMethods {
    int limit;

    public BankCard(int balance) {
        super(balance);
        this.limit = 10000;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("оплата банковской картой");
        return amount <= super.getBalance() + this.limit;
    }
}
