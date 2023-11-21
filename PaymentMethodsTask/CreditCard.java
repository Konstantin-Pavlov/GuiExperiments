package PaymentMethodsTask;

import java.math.BigDecimal;

public class CreditCard extends PaymentMethods {
    private BigDecimal limit;

    public CreditCard(BigDecimal balance) {
        super(balance);
        this.limit.valueOf(10000);
    }

    @Override
    public boolean pay(BigDecimal amount) {
        //compareTo Returns: -1, 0, or 1 as this BigDecimal is numerically less than, equal to, or greater than val
        System.out.println("оплата кредитной картой");
        boolean succes = true;
        BigDecimal curBalance = super.getBalance();

        if(amount.compareTo(curBalance) <= 0){
            System.out.println("С вашей кредитки списано " + amount);
            super.setBalance(curBalance.subtract(amount));

        }
        else if (amount.compareTo(curBalance.add(this.limit)) <= 0){;
            System.out.println("средств кредитки не хватило, с лимита списано " + (curBalance.subtract(amount)).abs());
            super.setBalance(BigDecimal.valueOf(0));
            this.limit.subtract((curBalance.subtract(amount)).abs());
        }
        else {
            System.out.println("не хватает средств кредитки и лимита чтобы оплатить");
            succes = false;
        }
        return succes;
    }

    public BigDecimal getLimit() {
        return this.limit;
    }
}
