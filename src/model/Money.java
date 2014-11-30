package model;

public class Money {
    private final float amount;
    private final Currency currency;

    public Money(Currency currency, float amount) {
        this.amount = amount;
        this.currency = currency;
    }

    public float getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
