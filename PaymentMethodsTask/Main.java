package PaymentMethodsTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Human human = new Human();
        human.buyProduct(25000);
        System.out.println("баланс кредитки: " + human.getCreditCardBalance());
        System.out.println("баланс лимита по кредитке: " + human.getCreditCardLimit());
    }
}
