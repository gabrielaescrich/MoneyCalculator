package model;

public class ExchangeRate {
    
    private Currency from;
    private Currency to;
    private float rate;  

    public ExchangeRate(Currency from, Currency to, float rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public String getFrom() {
        return from.toString();
    }

    public String getTo() {
        return to.toString();
    }

    public float getRate() {
        return rate;
    }
    
}
