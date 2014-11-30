package model;
import java.util.ArrayList;
import java.util.Iterator;

public class CurrencySet {
    private final ArrayList<Currency> set;

    public CurrencySet() {
        set = new ArrayList<Currency>();
    }

    public void add(Currency currency){
        set.add(currency);
    }
}
