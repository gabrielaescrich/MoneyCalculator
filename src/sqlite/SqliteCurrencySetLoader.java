
package sqlite;

import model.Currency;
import model.CurrencySet;
import persistence.CurrencySetLoader;

/**
 *
 * @author GABY
 */
public class SqliteCurrencySetLoader implements CurrencySetLoader {

    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        set.add((new Currency("EUR", "Euro", "€")));
        set.add((new Currency("USD", "Dólar", "$")));
        return set;
    }
    
}
