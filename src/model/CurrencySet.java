package model;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class CurrencySet {
    private final SortedMap<String, Currency> set;

    public CurrencySet() {
        set = new TreeMap<String, Currency>();
    }

    public void addCurrency(Currency currency) {
        set.put(currency.getCode(), currency);
    }

    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
