package PaymentMethodsTask;

import java.math.BigDecimal;

public class BankCard extends PaymentMethods {
    int limit;

    public BankCard(BigDecimal balance) {
        super(balance);
        this.limit = 10000;
    }

    @Override
    public boolean pay(BigDecimal amount) {
        System.out.println("оплата банковской картой");
        return amount.compareTo(super.getBalance().add(this.limit)) <= 0; 
         
    }
}
