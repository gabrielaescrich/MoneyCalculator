package model;

public class Money {
    private float amount;
    private Currency currency;

    public Money(Currency currency, float amount) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency.getSymbol();
    }

    public float getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
