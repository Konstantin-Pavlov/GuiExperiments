package PaymentMethodsTask;

import java.util.Random;

public class Human {
    private double money;
    private Random random = new Random();
    PaymentMethods[] paymentMethods = { new Cash(5000), new CreditCard(10000), new BankCard(7000) };

    public Human(double money) {
        this.money = money;
    }

    public Human() {
    }

    public double getMoney() {
        return money;
    }

    public boolean buyProduct(double price) {
        int choosingPaymentMethod = this.random.nextInt(2);
        // return this.paymentMethods[1].pay(price);
        return this.paymentMethods[0].pay(price);
    }

    public double getCreditCardBalance(){
        return paymentMethods[1].getBalance();
    }

    public int getCreditCardLimit(){
        // to use getLimit() method need to cast to CreditCard
        // CreditCard card = (CreditCard) paymentMethods[1];
        // return card.getLimit();

        // another way in one line
        return ((CreditCard) paymentMethods[1]).getLimit();
    }

}
