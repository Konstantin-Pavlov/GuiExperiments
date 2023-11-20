package PaymentMethodsTask;

public class Cash extends PaymentMethods {
    public Cash(int balance) {
        super(balance);
    }

    public boolean pay(double amount) {
        double curBalance = super.getBalance();
        boolean possibleToPay = amount <= curBalance;
        System.out.println("оплата наличными");
        System.out.println("Средсва: " + curBalance);

        if (possibleToPay) {
            super.setBalance(curBalance - amount);
            System.out.println("заплачено: " + amount);
            System.out.println("Осталось: " + super.getBalance());
        } else {
            System.out.println("не хватает средств");
        }
        return possibleToPay;
    
    }
}
