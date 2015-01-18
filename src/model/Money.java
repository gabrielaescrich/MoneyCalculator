package model;

public class Money {
    private final double amount;
    private final Currency currency;

    public Money(Currency currency, double amount) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency.getSymbol();
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
