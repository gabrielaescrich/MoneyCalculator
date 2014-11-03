package model;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class CurrencySet {
    private final SortedMap<String, Currency> set;

    public CurrencySet() {
        set = new TreeMap<String, Currency>();
    }
}
