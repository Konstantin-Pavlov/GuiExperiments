package PaymentMethodsTask;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.buyProduct(BigDecimal.valueOf(4985.65));
        System.out.println("баланс кредитки: " + human.getCreditCardBalance());
        System.out.println("баланс лимита по кредитке: " + human.getCreditCardLimit());
        System.out.println("баланс банковской карты: " + human.getBankCardBalance());
        System.out.println("баланс лимита по банковской карте: " + human.getBankCardLimit());
        System.out.println("наличных: " + human.getCashBalance());
    }
}
