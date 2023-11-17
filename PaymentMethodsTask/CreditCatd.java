package PaymentMethodsTask;

public class CreditCatd extends PaymentMethods{

    public CreditCatd(int balance) {
        super(balance);
    }

    @Override
    public boolean pay(double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }
    
}
