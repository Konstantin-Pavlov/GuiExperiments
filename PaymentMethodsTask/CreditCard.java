package PaymentMethodsTask;

public class CreditCard extends PaymentMethods {
    private int limit;

    public CreditCard(int balance) {
        super(balance);
        this.limit = 10000;
    }

    @Override
    public boolean pay(double amount) {
        boolean succes = true;
        double curBalance = super.getBalance();
        if(amount <= curBalance){
            System.out.println("С вашей кредитки списано " + amount);
            super.setBalance(curBalance - amount);
        }
        else if (amount <= curBalance + this.limit){
            System.out.println("средств кредитки не хватило, с лимита списано " + Math.abs(curBalance - amount));
            super.setBalance(0);
            this.limit -= (Math.abs(curBalance - amount));
        }
        else {
            System.out.println("не хватает средств кредитки и лимита чтобы оплатить");
            succes = false;
        }
        return succes;
    }

    public int getLimit() {
        return this.limit;
    }
}
