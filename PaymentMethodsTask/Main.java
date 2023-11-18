package PaymentMethodsTask;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.buyProduct(15000);
        System.out.println("баланс кредитки: " + human.getCreditCardBalance());
        System.out.println("баланс лимита по кредитке: " + human.getCreditCardLimit());
    }
}
