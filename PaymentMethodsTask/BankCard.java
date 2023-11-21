package PaymentMethodsTask;

import java.math.BigDecimal;

public class BankCard extends PaymentMethods {
    BigDecimal limit;

    public BankCard(BigDecimal balance) {
        super(balance);
        limit = BigDecimal.valueOf(10000);
    }

    @Override
    public boolean pay(BigDecimal amount) {
        System.out.println("оплата банковской картой");
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
            limit = this.limit.subtract((curBalance.subtract(amount)).abs());
        }
        else {
            System.out.println("не хватает средств кредитки и лимита чтобы оплатить");
            succes = false;
        }
        return succes;
         
    }
}
