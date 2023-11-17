package PaymentMethodsTask;

public class Human {
    private double money;
    PaymentMethods[] paymentMethods = { new Cash(5000), new CreditCatd(10000), new BankCard(7000) };

    public Human(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public boolean buyProduct(double price){
        return true;
    }

}
