package model;

public class Money {
    private final float amount;
    private final Currency currency;

    public Money(Currency currency, float amount) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency.getSymbol();
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
