package PaymentMethodsTask;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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

    public void buyProduct(BigDecimal price) {

        System.out.println("цена покупки: " + new DecimalFormat("#.##").format(price));
        int choosingPaymentMethod = this.random.nextInt(3);
        if (this.paymentMethods[choosingPaymentMethod].pay(price)) {
            System.out.println("Покупка совершена");
        } else {
            System.out.println("Не удалось купить");
        }
    }

    public String getCreditCardBalance() {
        return paymentMethods[1].getBalanceInDecimalFormat(paymentMethods[1].getBalance());
    }

    public String getBankCardBalance() {
        return paymentMethods[1].getBalanceInDecimalFormat(paymentMethods[2].getBalance());
    }

    public String getCashBalance() {
        return paymentMethods[1].getBalanceInDecimalFormat(paymentMethods[0].getBalance());
    }

    public String getCreditCardLimit() {
        // to use getLimit() method need to cast to CreditCard
        // CreditCard card = (CreditCard) paymentMethods[1];
        // return card.getLimit();

        // another way in one line
        return ((Card) paymentMethods[1]).getLimitInDecimalFormat();
    }

    public String getBankCardLimit() {
        return ((Card) paymentMethods[2]).getLimitInDecimalFormat();
    }

}
