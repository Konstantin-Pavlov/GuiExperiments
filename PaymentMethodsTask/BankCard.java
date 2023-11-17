package PaymentMethodsTask;

public class BankCard extends PaymentMethods {
    int limit;
    public BankCard(int balance) {
        super(balance);
        this.limit = 10000;
    }

    @Override
    public boolean pay(double amount) {
        
    }
}
