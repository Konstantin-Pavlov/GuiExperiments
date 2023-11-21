package PaymentMethodsTask;

import java.math.BigDecimal;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        double price = new Random().nextDouble(50000);

        drawLine('#', 100, false);
        printBalances(human, "Балансы до покупки");

        human.buyProduct(BigDecimal.valueOf(price));

        printBalances(human, "Балансы после покупки");
        drawLine('#', 100, false);

    }

    private static void printBalances(Human human, String message) {
        drawLine( '-', 50, true);
        System.out.println("\t\t" + message + "\n");
        System.out.println("баланс кредитки: " + human.getCreditCardBalance());
        System.out.println("баланс лимита по кредитке: " + human.getCreditCardLimit());
        System.out.println("баланс банковской карты: " + human.getBankCardBalance());
        System.out.println("баланс лимита по банковской карте: " + human.getBankCardLimit());
        System.out.println("Наличные: " + human.getCashBalance());
        drawLine( '-', 50, true);
    }

    private static void drawLine(char c, int times, boolean tablulation) {
        if(tablulation){
            System.out.print("\n\t\t");
        }
        for (int i = 0; i < times; i++) {
            System.out.print(c);
        }
        System.out.println("\n");
    }
}
