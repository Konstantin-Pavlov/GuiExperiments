package PaymentMethodsTask;

public class CreditCatd extends PaymentMethods {
    int limit;

    public CreditCatd(int balance) {
        super(balance);
        this.limit = 10000;
    }

    @Override
    public boolean pay(double amount) {
        return amount <= super.getBalance() + this.limit;
    }

}
