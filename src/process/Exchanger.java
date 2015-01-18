package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {
    
    private final double amount;
    private final ExchangeRate exchange;

    public Exchanger(double amount, ExchangeRate exchange) {
        this.amount = amount;
        this.exchange = exchange;
    }    
    
    public Money getMoney (){
        return new Money(getExchange(), exchange.getTo());
    }
    public double getExchange(){
        return amount*exchange.getRate();
    }
    
}
