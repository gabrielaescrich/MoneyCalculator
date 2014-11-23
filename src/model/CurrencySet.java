package model;
import java.util.SortedMap;
import java.util.TreeMap;

public class CurrencySet {
    private final SortedMap<String, Currency> set;

    public CurrencySet() {
        set = new TreeMap<String, Currency>();
    }
    public void addCurrency(Currency set){
        this.set.put(set.getCode(), set);
    }
}

