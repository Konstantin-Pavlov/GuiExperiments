package PaymentMethodsTask;

import java.math.BigDecimal;

public abstract class Card extends PaymentMethods {

    private BigDecimal limit;

    protected Card(BigDecimal balance) {
        super(balance);
    }

    public BigDecimal getLimit() {
        return this.limit;
    }

    public String getLimitInDecimalFormat() {
        return super.getBalanceInDecimalFormat(this.limit);
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}
