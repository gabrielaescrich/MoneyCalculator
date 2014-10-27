package model;

public class ExchangeRate {
    
    private Currency from;
    private Currency to;
    private Double rate;  

    public ExchangeRate(Currency from, Currency to, Double rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Double getRate() {
        return rate;
    }
    
}
