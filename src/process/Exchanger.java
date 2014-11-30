package process;

import model.Currency;
import model.Money;

public class Exchanger {
    public static Money convert(Currency currency, float amount, float rate){
        return new Money(currency, amount*rate);
    }
    
}
