package us;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {

    private final CurrencySet set;
    Exchange ex;
    
    public ExchangeDialog(CurrencySet set) {
        this.set = set;
        ex = new Exchange(new Money(readCurrency("origen"), readAmount()),readCurrency("destino"));
    }

    private Currency readCurrency(String x) {
        System.out.print("Elegir divisa " + x + ": ");
        showCurrencies(set);
    }
    
    private float readAmount() {
        
    }

    private void showCurrencies(CurrencySet set) {
        int i = 0;
        for ( Currency currency : set.){
            System.out.println(currency.toString() +" (" + i++ + ") ");
            
        }
    }
}
