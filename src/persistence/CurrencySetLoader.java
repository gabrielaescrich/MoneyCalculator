package persistence;

import model.Currency;
import model.CurrencySet;


public class CurrencySetLoader {

    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        set.add(new Currency("Euro", "EUR", "€"));
        set.add(new Currency("Dolar", "USD", "$"));
        set.add(new Currency("Libra", "GBP", "L"));
        set.add(new Currency("Yen", "JPY", "Y"));
        
        return set;
    }
   


}