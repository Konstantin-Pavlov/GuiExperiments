package PaymentMethodsTask;

import java.math.BigDecimal;
import java.util.Random;

public class Human {
    private double money;
    private Random random = new Random();
    PaymentMethods[] paymentMethods = { new Cash(BigDecimal.valueOf(5000)), 
        new CreditCard(BigDecimal.valueOf(10000)), new BankCard(BigDecimal.valueOf(7000)) };

    public Human(double money) {
        this.money = money;
    }

    public Human() {
    }

    public double getMoney() {
        return money;
    }

    public boolean buyProduct(BigDecimal price) {
        int choosingPaymentMethod = this.random.nextInt(2);
        // return this.paymentMethods[1].pay(price);
        return this.paymentMethods[0].pay(price);
    }

    public BigDecimal getCreditCardBalance(){
        return paymentMethods[1].getBalance();
    }

    public BigDecimal getCreditCardLimit(){
        // to use getLimit() method need to cast to CreditCard
        // CreditCard card = (CreditCard) paymentMethods[1];
        // return card.getLimit();

        // another way in one line
        return ((CreditCard) paymentMethods[1]).getLimit();
    }

}
