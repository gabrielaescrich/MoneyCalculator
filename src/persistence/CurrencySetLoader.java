package persistence;

import model.Currency;
import model.CurrencySet;


public class CurrencySetLoader {

    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        set.addCurrency(new Currency("Euro", "EUR", "€"));
        set.addCurrency(new Currency("Dolar", "USD", "$"));
        set.addCurrency(new Currency("Libra", "GBP", "L"));
        set.addCurrency(new Currency("Yen", "JPY", "Y"));
        
        return set;
    }
   


}