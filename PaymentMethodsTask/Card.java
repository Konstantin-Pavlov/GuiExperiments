package PaymentMethodsTask;

public abstract class Card extends PaymentMethods {

    private int limit;

    public Card(int balance) {
        super(balance);
        this.limit = 10000; // by default
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
