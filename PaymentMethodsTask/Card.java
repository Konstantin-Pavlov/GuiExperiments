package PaymentMethodsTask;

import java.math.BigDecimal;

public abstract class Card extends PaymentMethods {

    private BigDecimal limit;

    public Card(BigDecimal balance) {
        super(balance);
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}
